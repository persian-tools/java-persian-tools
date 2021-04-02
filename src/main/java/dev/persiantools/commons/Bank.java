package dev.persiantools.commons;

import java.util.List;

public class Bank {

    private String persianName;
    private String name;
    private String nickName;
    private List<Integer> cardNumberIdentifiers;
    private boolean accountNumberAvailable;
    private String iban;

    private Bank(){}

  public static class Builder{
      private String nickname;
      private String name;
      private String persianName;
      private String ibanCode;
      private List<Integer> cardNumberIdentifiers;
      private boolean accountNumberAvailable;

      public Builder withNickName(String nickname){
          this.nickname = nickname;
          return this;
      }

      public Builder withName(String name){
          this.name = name;
          return this;
      }

      public Builder withPersianName(String persianName){
          this.persianName = persianName;
          return this;
      }

      public Builder withIbanCode(String iban){
          this.ibanCode = iban;
          return this;
      }

      public Builder withCardNumberIdentifiers(List<Integer> identifiers){
          this.cardNumberIdentifiers = identifiers;
          return this;
      }

      public Builder isAccountNumberAvailable(boolean accountNumberAvailable){
          this.accountNumberAvailable = accountNumberAvailable;
          return this;
      }

      public Bank make(){
          Bank bank = new Bank();

          bank.nickName = this.nickname;
          bank.name = this.name;
          bank.iban = this.ibanCode;
          bank.persianName = this.persianName;
          bank.cardNumberIdentifiers = this.cardNumberIdentifiers;
          bank.accountNumberAvailable = this.accountNumberAvailable;

          return bank;
      }
  }

    public String getPersianName() {
        return persianName;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public List<Integer> getCardNumberIdentifiers() {
        return cardNumberIdentifiers;
    }

    public boolean isAccountNumberAvailable() {
        return accountNumberAvailable;
    }

    public String getIban() {
        return iban;
    }



}
