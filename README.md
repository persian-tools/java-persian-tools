<div align="center">
	<p align="center">
		<img src="https://github.com/persian-tools/persian-tools/raw/master/images/logo.png" width="200" />
	</p>
	<h1 align="center">Java Persian tools</h1>
    <p align="center">This repository is java port of <a href="https://github.com/persian-tools/persian-tools">persian-tools</a></p>
	<p align="center">PersianTools is a standalone, library-agnostic Java that enables some of the Persian features for use in the Java.</p>
</div>
<hr />
  
  
## Features
- Bank Utils
    - [x] [Find bank information by card number](#find-bank-information-by-card-number)
    - [x] [Find bank information by IBAN (sheba)](#find-bank-information-by-iban-sheba)
    - [x] [Validate card number](#validate-card-number)
    - [x] [Validate IBAN](#validate-iban)
- NationalId Utils
    - [x] [Validate Iranian national id (code-e melli)](#validate-iranian-national-id-code-e-melli)
    - [x] [Find birthplace by national id](#find-birthplace-by-national-id)
- Text Utils
    - [ ] Convert Persian words to the number
    - [ ] Convert Numbers to Persian words
    - [ ] Fix Persian characters in URL
    - [ ] Fix Persian zero-width non-joiner (Replace spaces by half-space)
    - [ ] Validate the correctness of the text of the Persian language and clear the Arabic letters in the Persian text
- Digit Utils
    - [ ] Convert Persian numbers to Arabic or English numbers and vice versa
    - [ ] Add and remove commas to numbers
- Date Utils
    - [ ] Convert Jalaali date-time into a time ago
- Miscellaneous
    - [ ] Validate Iranian legal id (shenase hoghoghi)
    - [ ] Bill calculator
    - [ ] Validate and find information of phone number  

## Install
- [ ] upload artifact to Maven Central Repository

## Usage
Let's take a look at what an example test case would look like using java-persian-tools.  

### Find bank information by card number  

Find the issuer bank of the card number. Throws `BankNotFoundByProvidedCardNumber` if the card number is not valid or no bank found.

```java
Bank bank = BankUtils.findByCardNumber("6037701689095443"); // { persianName: 'بانک کشاورزی', name: 'Keshavarzi', nickname: 'keshavarzi', ... }
Bank bank = BankUtils.findByCardNumber("621986103452900"); // throws BankNotFoundByProvidedCardNumber
```

### Find bank information by IBAN (sheba)
Find the issuer bank of the IBAN. Throws `BankNotFoundByProvidedIban` if the IBAN is not valid or no bank found.

```java
Bank bank = BankUtils.findByIban("IR550570022080013447370101"); // { persianName: 'بانک پاسارگاد', name: 'Pasargad Bank', nickname: 'pasargad', ... }
Bank bank = BankUtils.findByCardNumber("IR820540102680020817909001"); // throws BankNotFoundByProvidedIban
```

### Validate card number
```java
boolean isValid = BankUtils.isValidCardNumber("6037701689095443"); //true
boolean isValid = BankUtils.isValidCardNumber("6219861034529008"); //false
```

### Validate IBAN
```java
boolean isValid = BankUtils.isValidIban("IR820540102680020817909002"); //true
boolean isValid = BankUtils.isValidIban("IR012345678901234567890123"); //false
```

### Validate Iranian national id (code-e melli)
Check whether the provided National-id is valid or not. In case of missing starting zeros (max 2 zeros) it will pad the input with "0". It throws `IllegalArgumentException` when the input is null or empty.

```java
boolean isValid = NationalIdUtils.verifyIranianNationalId("0499370899"); //true
boolean isValid = NationalIdUtils.verifyIranianNationalId("67749828"); //true
boolean isValid = NationalIdUtils.verifyIranianNationalId("1111111111"); //true
boolean isValid = NationalIdUtils.verifyIranianNationalId("0684159415"); //false
boolean isValid = NationalIdUtils.verifyIranianNationalId("0000000000"); //false
boolean isValid = NationalIdUtils.verifyIranianNationalId(null); //throws IllegalArgumentException
```

### Find birthplace by national id
Returns a list of possible birthplaces for provided national id. Returns empty list if provided national id is invalid and throws `IllegalArgumentException` if the input is null or empty.

```java
List<Hometown> hometowns = NationalIdUtils.getPlaceByIranNationalId("0084575948"); // [{ province: 'تهران', city: 'تهران مرکزی' }]
List<Hometown> hometowns = NationalIdUtils.getPlaceByIranNationalId("2530000000"); // [{ province: 'فارس', city: 'اقلید' },{ province: 'فارس', city: 'سپیدان' }]
List<Hometown> hometowns = NationalIdUtils.getPlaceByIranNationalId("0008454594"); // []
List<Hometown> hometowns = NationalIdUtils.getPlaceByIranNationalId(null); //throws IllegalArgumentException
```

## Contributing

Thank you for your interest in contributing to Java Persian Tools. Contributions are welcome and please feel free to put up a PR for any issue or feature request.
