package dev.persiantools.usecases.exceptions;

public class BankNotFoundByProvidedDigits extends Exception{
    public BankNotFoundByProvidedDigits(Integer digitsToFindBank){
        super(String.format("No Bank Find By Provided %s, Ensure you have entered correct card-number", digitsToFindBank));
    }
}
