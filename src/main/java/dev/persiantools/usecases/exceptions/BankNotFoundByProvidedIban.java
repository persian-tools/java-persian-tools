package dev.persiantools.usecases.exceptions;

public class BankNotFoundByProvidedIban extends Exception {

  public BankNotFoundByProvidedIban(String Iban) {
    super(String.format("No Bank Find By Provided %s, Ensure you have entered correct IBAN", Iban));
  }
}
