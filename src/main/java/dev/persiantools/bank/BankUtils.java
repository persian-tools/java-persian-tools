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
