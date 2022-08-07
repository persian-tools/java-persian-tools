package dev.persiantools.bank;

import dev.persiantools.bank.exceptions.BankNotFoundByProvidedCardNumber;
import dev.persiantools.bank.exceptions.BankNotFoundByProvidedIban;

import java.math.BigInteger;
import java.util.Optional;
import java.util.TreeMap;

public class BankUtils {

    private static final TreeMap<Integer, Bank> cardIdentifiers = BanksCollection.getInstance().getCardNumberMapping();

    private BankUtils() {
    }

    public static Bank findByCardNumber(Integer cardNumber) throws BankNotFoundByProvidedCardNumber {

        Bank searchResult = cardIdentifiers.get(cardNumber);
        if (searchResult == null) {
            throw new BankNotFoundByProvidedCardNumber(cardNumber);
        }

        return searchResult;
    }

    /**
     * Detect whether the input card number is valid or not
     * <p>Start from left to right, based on the position of every digit:</p>
     * <ul>
     *     <li>if the position is <strong>odd</strong> multiply the digit by <strong>2</strong>
     *      (note that because java is a zero-based index language in which
     *      the position of the first digit is zero but it is considered as odd)</li>
     *     <li>otherwise multiply the digit by <strong>1</strong></li>
     *     <li>sum up every new digit</li>
     *     <li>if the result is divisible by 10 then the result is valid</li>
     * </ul>
     * @param cardNumber 16 digit of card number in string format without any separator
     */
    public static boolean isValidCardNumber(String cardNumber) {

        if (cardNumber.length() != 16 ||
                Integer.parseInt(cardNumber.substring(0, 8)) == 0 ||
                Integer.parseInt(cardNumber.substring(8, 16)) == 0
        )
            return false;

        var sum = 0;
        for (int i = 0; i < 16; i++) {

            int radix = (i % 2 == 0) ? 2 : 1;
            int digit = Integer.parseInt(String.valueOf(cardNumber.charAt(i))) * radix;
            sum += digit > 9 ? digit - 9 : digit;

        }
        return sum % 10 == 0;
    }

    public static Bank findByIban(String ibanIdentifier) throws BankNotFoundByProvidedIban {

        Optional<Bank> searchResult = cardIdentifiers
                .values()
                .stream()
                .filter(bank -> bank.getIban().equals(ibanIdentifier))
                .findFirst();

        if (searchResult.isPresent()) {
            return searchResult.get();
        }

        throw new BankNotFoundByProvidedIban(ibanIdentifier);
    }

    public static boolean isValidIban(String iban) {

        String numericCountryCode = "1827";
        String checkDigitsValue = iban.substring(2, 4);

        BigInteger standardModNumber = BigInteger.valueOf(97);
        int countryCode = 2;
        int checkDigits = 2;

        String preparedIban = iban.substring(countryCode).substring(checkDigits).concat(numericCountryCode).concat(checkDigitsValue);

        return new BigInteger(preparedIban).mod(standardModNumber).intValue() == 1;
    }
}
