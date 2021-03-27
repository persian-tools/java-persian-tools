package dev.persiantools.commons;

public class Bank {
    private String nickname;
    private String name;
    private String persianName;
    private String ibanCode;
    private Integer cardNumberDigit;
    private boolean accountNumberAvailable;

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public String getPersianName() {
        return persianName;
    }

    public Integer getCardNumberDigit() {
        return cardNumberDigit;
    }

    public String getIbanCode() {
        return ibanCode;
    }

    public boolean getAccountNumberAvailable() {
        return accountNumberAvailable;
    }

    public Bank setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public Bank setName(String name) {
        this.name = name;
        return this;
    }

    public Bank setPersianName(String persianName) {
        this.persianName = persianName;
        return this;
    }

    public Bank setCardNumberDigitIdentifier(Integer cardNumberDigit) {
        this.cardNumberDigit = cardNumberDigit;
        return this;
    }

    public Bank setIbanCode(String ibanCode) {
        this.ibanCode = ibanCode;
        return this;
    }

    public Bank setAccountNumberAvailable(boolean accountNumberAvailable) {
        this.accountNumberAvailable = accountNumberAvailable;
        return this;
    }

}
