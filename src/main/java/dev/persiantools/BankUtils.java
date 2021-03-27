package dev.persiantools;

import dev.persiantools.commons.Bank;
import dev.persiantools.usecases.collections.BanksCollection;
import dev.persiantools.usecases.exceptions.BankNotFoundByProvidedCardNumber;
import dev.persiantools.usecases.exceptions.BankNotFoundByProvidedIban;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;

public class BankUtils {

  private final List<Bank> banksCollection;
  private final TreeMap<Integer, Bank> cardIdentifiers;

  public BankUtils() {
    BanksCollection banksData = new BanksCollection();
    this.banksCollection = banksData.getBanksCollection();
    this.cardIdentifiers = banksData.getCardNumberMapping();
  }

  public Bank findByCardNumber(Integer cardNumber) throws BankNotFoundByProvidedCardNumber {
    Bank searchResult = cardIdentifiers.get(cardNumber);

    if (searchResult == null) {
      throw new BankNotFoundByProvidedCardNumber(cardNumber);
    }

    return searchResult;
  }

  public Bank findByIban(String ibanIdentifier) throws BankNotFoundByProvidedIban {
    Optional<Bank> searchResult = banksCollection.stream().filter(bank -> bank.getIbanCode().equals(ibanIdentifier)).findFirst();

    if (searchResult.isPresent()) {
      return searchResult.get();
    }

    throw new BankNotFoundByProvidedIban(ibanIdentifier);
  }
}
