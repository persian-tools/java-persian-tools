package dev.persiantools.commons;

import java.util.List;

public class Bank {

  private final String nickname;
  private final String name;
  private final String persianName;
  private final String ibanCode;
  private final List<Integer> cardNumberIdentifiers;
  private final boolean accountNumberAvailable;

  public Bank(String nickname, String name, String persianName, String ibanCode, List<Integer> cardNumberIdentifiers, boolean accountNumberAvailable) {
      this.nickname = nickname;
      this.name = name;
      this.persianName = persianName;
      this.ibanCode = ibanCode;
      this.cardNumberIdentifiers = cardNumberIdentifiers;
      this.accountNumberAvailable = accountNumberAvailable;
  }

  public String getNickname() {
    return nickname;
  }

  public String getName() {
    return name;
  }

  public String getPersianName() {
    return persianName;
  }

  public List<Integer> getCardNumberIdentifiers() {
    return cardNumberIdentifiers;
  }

  public String getIbanCode() {
    return ibanCode;
  }

  public boolean getAccountNumberAvailable() {
    return accountNumberAvailable;
  }

}
