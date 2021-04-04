package dev.persiantools.usecases.exceptions;

public class BankNotFoundByProvidedCardNumber extends Exception {

  public BankNotFoundByProvidedCardNumber(Integer digitsToFindBank) {
    super(String.format("No Bank Find By Provided %s, Ensure you have entered correct card-number", digitsToFindBank));
  }
}
