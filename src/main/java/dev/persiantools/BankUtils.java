package dev.persiantools;

import dev.persiantools.usecases.exceptions.BankNotFoundByProvidedCardNumber;
import dev.persiantools.usecases.collections.BanksCollection;

public class BankUtils {

    private final BanksCollection banksCollection;

    public BankUtils() {
        this.banksCollection = new BanksCollection();
    }

    public String getBankNameFromCardNumber(Integer cardNumber) throws BankNotFoundByProvidedCardNumber {
        return this.banksCollection
            .findByCardNumberDigitIdentifier(cardNumber)
            .getPersianName();
    }
}
