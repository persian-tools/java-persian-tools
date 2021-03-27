package dev.persiantools.usecases.collections;

import dev.persiantools.commons.Bank;
import dev.persiantools.usecases.exceptions.BankNotFoundByProvidedCardNumber;
import dev.persiantools.usecases.exceptions.BankNotFoundByProvidedIban;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BanksCollection {

    private final List<Bank> bankCollections = new ArrayList<>();

    public BanksCollection() {
     addCentralBank();
     addSanatOMadan();
     addMellat();
     addMelal();
     addRefah();
     addMaskan();
     addSepah();
     addKeshavarzi();
     addMelli();
     addTejarat();
     addSaderat();
     addTosee();
     addTooaddaavon();
     addToseeSaderat();
     addPost();
     addGhavamin();
     addKarafarin();
     addParsian();
     addEghtesadNovin();
     addSaman();
     addPasargad();
     addSina();
     addSarmayeh();
     addShahr();
     addAyandeh();
     addAnsar();
     addGardeshgari();
     addHekmatIranian();
     addDey();
     addIranZamin();
     addIranVenezuela();
     addMiddleEastBank();
     addMehrEqtesad();
     addNoorBank();
     addResalat();
     addKosar();
     addMehrIran();
    }


    public Bank findByCardNumberDigitIdentifier(Integer cardNumber) throws BankNotFoundByProvidedCardNumber {
        Optional<Bank> searchResult = bankCollections.stream()
            .filter(bank -> bank.getCardNumberDigit().equals(cardNumber))
            .findFirst();

        if (searchResult.isPresent()){
            return searchResult.get();
        }

        throw new BankNotFoundByProvidedCardNumber(cardNumber);
    }

    public Bank findByIbanIdentifier(String  ibanIdentifier) throws BankNotFoundByProvidedIban {
        Optional<Bank> searchResult = bankCollections.stream()
            .filter(bank -> bank.getIbanCode().equals(ibanIdentifier))
            .findFirst();

        if (searchResult.isPresent()){
            return searchResult.get();
        }

        throw new BankNotFoundByProvidedIban(ibanIdentifier);
    }

    private void addCentralBank(){
        bankCollections.add(
            new Bank().setNickname("central-bank").
                setName("Central Bank of Iran").
                setPersianName("بانک مرکزی جمهوری اسلامی ایران").
                setIbanCode("010").
                setAccountNumberAvailable(false));
    }

    private void addSanatOMadan(){
        bankCollections.add(
            new Bank().setNickname("sanat-o-madan").
                setName("Sanat O Madan Bank").
                setPersianName("بانک صنعت و معدن").
                setIbanCode("011").
                setAccountNumberAvailable(false));
    }
    private void addMellat(){
        bankCollections.add(
            new Bank().setNickname("mellat").
                setName("Mellat Bank").
                setPersianName("بانک ملت").
                setCardNumberDigitIdentifier(636214).
                setIbanCode("012").
                setAccountNumberAvailable(false));
    }
    private void addRefah(){
        bankCollections.add(
            new Bank().setNickname("refah").
                setName("Refah Bank").
                setPersianName("بانک رفاه کارگران").
                setIbanCode("013").
                setAccountNumberAvailable(false));
    }
    private void addMaskan(){
        bankCollections.add(
            new Bank().setNickname("maskan").
                setName("Maskan Bank").
                setPersianName("بانک مسکن").
                setIbanCode("014").
                setAccountNumberAvailable(false));
    }
    private void addSepah(){
        bankCollections.add(
            new Bank().setNickname("sepah").
                setName("Sepah Bank").
                setPersianName("بانک سپه").
                setIbanCode("015").
                setAccountNumberAvailable(false));
    }
    private void addKeshavarzi(){
        bankCollections.add(
            new Bank().setNickname("keshavarzi").
                setName("Keshavarzi").
                setPersianName("بانک کشاورزی").
                setIbanCode("016").
                setAccountNumberAvailable(false));
    }
    private void addMelli(){
        bankCollections.add(
            new Bank().setNickname("melli").
                setName("Melli").
                setPersianName("بانک ملی ایران").
                setIbanCode("017").
                setAccountNumberAvailable(false));
    }
    private void addTejarat(){
        bankCollections.add(
            new Bank().setNickname("tejarat").
                setName("Tejarat Bank").
                setPersianName("بانک تجارت").
                setIbanCode("018").
                setAccountNumberAvailable(false));
    }
    private void addSaderat(){
        bankCollections.add(
            new Bank().setNickname("saderat").
                setName("Saderat Bank").
                setPersianName("بانک صادرات ایران").
                setIbanCode("019").
                setAccountNumberAvailable(false));
    }
    private void addToseeSaderat(){
        bankCollections.add(
            new Bank().setNickname("tosee-saderat").
                setName("Tose Saderat Bank").
                setPersianName("بانک توسعه صادرات").
                setIbanCode("020").
                setAccountNumberAvailable(false));
    }
    private void addPost(){
        bankCollections.add(
            new Bank().setNickname("post").
                setName("Post Bank").
                setPersianName("پست بانک ایران").
                setIbanCode("021").
                setAccountNumberAvailable(false));
    }
    private void addTooaddaavon(){
        bankCollections.add(
            new Bank().setNickname("toose-taavon").
                setName("Tosee Taavon Bank").
                setPersianName("بانک توسعه تعاون").
                setIbanCode("022").
                setAccountNumberAvailable(false));
    }
    private void addTosee(){
        bankCollections.add(
            new Bank().setNickname("tosee").
                setName("Tosee Bank").
                setPersianName("موسسه اعتباری توسعه").
                setIbanCode("051").
                setAccountNumberAvailable(false));
    }
    private void addGhavamin(){
        bankCollections.add(
            new Bank().setNickname("ghavamin").
                setName("Ghavamin Bank").
                setPersianName("بانک قوامین").
                setIbanCode("052").
                setAccountNumberAvailable(false));
    }
    private void addKarafarin(){
        bankCollections.add(
            new Bank().setNickname("karafarin").
                setName("Karafarin Bank").
                setPersianName("بانک کارآفرین").
                setIbanCode("053").
                setAccountNumberAvailable(false));
    }
    private void addParsian(){
        bankCollections.add(
            new Bank().setNickname("parsian").
                setName("Parsian Bank").
                setPersianName("بانک پارسیان").
                setIbanCode("054").
                setAccountNumberAvailable(true));
    }
    private void addEghtesadNovin(){
        bankCollections.add(
            new Bank().setNickname("eghtesad-novin").
                setName("Eghtesad Novin Bank").
                setPersianName("بانک اقتصاد نوین").
                setIbanCode("055").
                setAccountNumberAvailable(false));
    }
    private void addSaman(){
        bankCollections.add(
            new Bank().setNickname("saman").
                setName("Saman Bank").
                setPersianName("بانک سامان").
                setIbanCode("056").
                setAccountNumberAvailable(false));
    }
    private void addPasargad(){
        bankCollections.add(
            new Bank().setNickname("pasargad").
                setName("Pasargad Bank").
                setPersianName("بانک پاسارگاد").
                setIbanCode("057").
                setAccountNumberAvailable(true));
    }
    private void addSarmayeh(){
        bankCollections.add(
            new Bank().setNickname("sarmayeh").
                setName("Sarmayeh Bank").
                setPersianName("بانک سرمایه").
                setIbanCode("058").
                setAccountNumberAvailable(false));
    }
    private void addSina(){
        bankCollections.add(
            new Bank().setNickname("sina").
                setName("Sina Bank").
                setPersianName("بانک سینا").
                setIbanCode("059").
                setAccountNumberAvailable(false));
    }
    private void addShahr(){
        bankCollections.add(
            new Bank().setNickname("shahr").
                setName("City Bank").
                setPersianName("بانک شهر").
                setIbanCode("061").
                setAccountNumberAvailable(true));
    }
    private void addAyandeh(){
        bankCollections.add(
            new Bank().setNickname("ayandeh").
                setName("Ayandeh Bank").
                setPersianName("بانک آینده").
                setIbanCode("062").
                setAccountNumberAvailable(false));
    }
    private void addAnsar(){
        bankCollections.add(
            new Bank().setNickname("ansar").
                setName("Ansar Bank").
                setPersianName("بانک انصار").
                setIbanCode("063").
                setAccountNumberAvailable(false));
    }
    private void addGardeshgari(){
        bankCollections.add(
            new Bank().setNickname("gardeshgari").
                setName("Gardeshgari Bank").
                setPersianName("بانک گردشگری").
                setIbanCode("064").
                setAccountNumberAvailable(false));
    }
    private void addHekmatIranian(){
        bankCollections.add(
            new Bank().setNickname("hekmat-iranian").
                setName("Hekmat Iranian Bank").
                setPersianName("بانک حکمت ایرانیان").
                setIbanCode("065").
                setAccountNumberAvailable(false));
    }
    private void addDey(){
        bankCollections.add(
            new Bank().setNickname("dey").
                setName("Dey Bank").
                setPersianName("بانک دی").
                setIbanCode("066").
                setAccountNumberAvailable(false));
    }
    private void addIranZamin(){
        bankCollections.add(
            new Bank().setNickname("iran-zamin").
                setName("Iran Zamin Bank").
                setPersianName("بانک ایران زمین").
                setIbanCode("069").
                setAccountNumberAvailable(false));
    }
    private void addResalat(){
        bankCollections.add(
            new Bank().setNickname("resalat").
                setName("Resalat Bank").
                setPersianName("بانک قرض الحسنه رسالت").
                setIbanCode("070").
                setAccountNumberAvailable(false));
    }
    private void addKosar(){
        bankCollections.add(
            new Bank().setNickname("kosar").
                setName("Kosar Credit Institute").
                setPersianName("موسسه اعتباری کوثر").
                setIbanCode("073").
                setAccountNumberAvailable(false));
    }
    private void addMelal(){
        bankCollections.add(
            new Bank().setNickname("melal").
                setName("Melal Credit Institute").
                setPersianName("موسسه اعتباری ملل").
                setIbanCode("075").
                setAccountNumberAvailable(false));
    }
    private void addMiddleEastBank(){
        bankCollections.add(
            new Bank().setNickname("middle-east-bank").
                setName("Middle East Bank").
                setPersianName("بانک خاورمیانه").
                setIbanCode("078").
                setAccountNumberAvailable(false));
    }
    private void addNoorBank(){
        bankCollections.add(
            new Bank().setNickname("noor-bank").
                setName("Noor Credit Institution").
                setPersianName("موسسه اعتباری نور").
                setIbanCode("080").
                setAccountNumberAvailable(false));
    }
    private void addMehrEqtesad(){
        bankCollections.add(
            new Bank().setNickname("mehr-eqtesad").
                setName("Mehr Eqtesad Bank").
                setPersianName("بانک مهر اقتصاد").
                setIbanCode("079").
                setAccountNumberAvailable(false));
    }
    private void addMehrIran(){
        bankCollections.add(
            new Bank().setNickname("mehr-iran").
                setName("Mehr Iran Bank").
                setPersianName("بانک مهر ایران").
                setIbanCode("060").
                setAccountNumberAvailable(false));
    }
    private void addIranVenezuela(){
        bankCollections.add(
            new Bank().setNickname("iran-venezuela").
                setName("Iran and Venezuela Bank").
                setPersianName("بانک ایران و ونزوئلا").
                setIbanCode("095").
                setAccountNumberAvailable(false));
    }

}
