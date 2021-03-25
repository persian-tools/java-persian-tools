package com.github.persian.tools;

import com.github.persian.usecases.exceptions.BankNotFoundByProvidedDigits;
import com.github.persian.usecases.hashtables.BankCodeMapping;

public class Bank {

    private final BankCodeMapping banksDetails;

    public Bank() {
        this.banksDetails = new BankCodeMapping();
    }

    public String getBankNameFromCardNumber(Integer cardNumber) throws BankNotFoundByProvidedDigits {
        String bankName = this.banksDetails.getBankDetails().get(cardNumber);

        if (bankName.isBlank()){
            throw new BankNotFoundByProvidedDigits(cardNumber);
        }

        return bankName;
    }
}
