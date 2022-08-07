package dev.persiantools.bank.exceptions;

public class BankNotFoundByProvidedCardNumber extends Exception {

  public BankNotFoundByProvidedCardNumber(String cardNumber) {
    super(String.format("No Bank Find By Provided %s, Ensure you have entered correct card-number", cardNumber));
  }
}
