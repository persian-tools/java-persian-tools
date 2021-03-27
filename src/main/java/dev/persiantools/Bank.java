package dev.persiantools;

import dev.persiantools.usecases.exceptions.BankNotFoundByProvidedDigits;
import dev.persiantools.usecases.hashtables.BankCodeMapping;

public class Bank {

    private final BankCodeMapping bankCodeMapping;

    public Bank() {
        this.bankCodeMapping = new BankCodeMapping();
    }

    public String getBankNameFromCardNumber(Integer cardNumber) throws BankNotFoundByProvidedDigits {
        String bankName = this.bankCodeMapping.getBankDetails().get(cardNumber);

        if (bankName.isBlank()){
            throw new BankNotFoundByProvidedDigits(cardNumber);
        }

        return bankName;
    }
}
