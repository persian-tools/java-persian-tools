package dev.persiantools.usecases.collections;

import dev.persiantools.commons.Bank;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Predicate;

public class BanksCollection {

  private final List<Bank> bankCollections = new ArrayList<>();
  private final TreeMap<Integer, Bank> cardNumberMapping = new TreeMap();

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

  public List<Bank> getBanksCollection() {
    return bankCollections;
  }

  public TreeMap<Integer, Bank> getCardNumberMapping() {
    return cardNumberMapping;
  }

  private void addCentralBank() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    cardNumberIdentifiers.add(636797);

    Bank bankObj = new Bank()
      .setNickname("central-bank")
      .setName("Central Bank of Iran")
      .setPersianName("بانک مرکزی جمهوری اسلامی ایران")
      .setCardNumberIdentifiers(cardNumberIdentifiers)
      .setIbanCode("010")
      .setAccountNumberAvailable(false);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addSanatOMadan() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    cardNumberIdentifiers.add(627961);

    Bank bankObj = new Bank()
      .setNickname("sanat-o-madan")
      .setName("Sanat O Madan Bank")
      .setPersianName("بانک صنعت و معدن")
      .setIbanCode("011")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addMellat() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    cardNumberIdentifiers.add(610433);
    cardNumberIdentifiers.add(991975);

    Bank bankObj = new Bank()
      .setNickname("mellat")
      .setName("Mellat Bank")
      .setPersianName("بانک ملت")
      .setIbanCode("012")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addRefah() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(589463);

    Bank bankObj = new Bank()
      .setNickname("refah")
      .setName("Refah Bank")
      .setPersianName("بانک رفاه کارگران")
      .setIbanCode("013")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addMaskan() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(628023);

    Bank bankObj = new Bank()
      .setNickname("maskan")
      .setName("Maskan Bank")
      .setPersianName("بانک مسکن")
      .setIbanCode("014")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addSepah() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(589210);

    Bank bankObj = new Bank()
      .setNickname("sepah")
      .setName("Sepah Bank")
      .setPersianName("بانک سپه")
      .setIbanCode("015")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addKeshavarzi() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    cardNumberIdentifiers.add(603770);
    cardNumberIdentifiers.add(639217);

    Bank bankObj = new Bank()
      .setNickname("keshavarzi")
      .setName("Keshavarzi")
      .setPersianName("بانک کشاورزی")
      .setIbanCode("016")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addMelli() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    cardNumberIdentifiers.add(170019);
    cardNumberIdentifiers.add(603799);

    Bank bankObj = new Bank()
      .setNickname("melli")
      .setName("Melli")
      .setPersianName("بانک ملی ایران")
      .setIbanCode("017")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addTejarat() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    cardNumberIdentifiers.add(585983);
    cardNumberIdentifiers.add(627353);
    Bank bankObj = new Bank()
      .setNickname("tejarat")
      .setName("Tejarat Bank")
      .setPersianName("بانک تجارت")
      .setIbanCode("018")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addSaderat() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    cardNumberIdentifiers.add(207177);
    cardNumberIdentifiers.add(627648);
    Bank bankObj = new Bank()
      .setNickname("saderat")
      .setName("Saderat Bank")
      .setPersianName("بانک صادرات ایران")
      .setIbanCode("019")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addToseeSaderat() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    cardNumberIdentifiers.add(207177);
    cardNumberIdentifiers.add(627648);

    Bank bankObj = new Bank()
      .setNickname("tosee-saderat")
      .setName("Tose Saderat Bank")
      .setPersianName("بانک توسعه صادرات")
      .setIbanCode("020")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addPost() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(627760);

    Bank bankObj = new Bank()
      .setNickname("post")
      .setName("Post Bank")
      .setPersianName("پست بانک ایران")
      .setIbanCode("021")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addTooaddaavon() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(502908);

    Bank bankObj = new Bank()
      .setNickname("toose-taavon")
      .setName("Tosee Taavon Bank")
      .setPersianName("بانک توسعه تعاون")
      .setIbanCode("022")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addTosee() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(628157);

    Bank bankObj = new Bank()
      .setNickname("tosee")
      .setName("Tosee Bank")
      .setPersianName("موسسه اعتباری توسعه")
      .setIbanCode("051")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addGhavamin() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(639599);
    Bank bankObj = new Bank()
      .setNickname("ghavamin")
      .setName("Ghavamin Bank")
      .setPersianName("بانک قوامین")
      .setIbanCode("052")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addKarafarin() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(627488);
    Bank bankObj = new Bank()
      .setNickname("karafarin")
      .setName("Karafarin Bank")
      .setPersianName("بانک کارآفرین")
      .setIbanCode("053")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addParsian() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(622106);
    cardNumberIdentifiers.add(627884);
    Bank bankObj = new Bank()
      .setNickname("parsian")
      .setName("Parsian Bank")
      .setPersianName("بانک پارسیان")
      .setIbanCode("054")
      .setAccountNumberAvailable(true)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addEghtesadNovin() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(627412);
    Bank bankObj = new Bank()
      .setNickname("eghtesad-novin")
      .setName("Eghtesad Novin Bank")
      .setPersianName("بانک اقتصاد نوین")
      .setIbanCode("055")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addSaman() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(621986);
    Bank bankObj = new Bank()
      .setNickname("saman")
      .setName("Saman Bank")
      .setPersianName("بانک سامان")
      .setIbanCode("056")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addPasargad() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(502229);
    cardNumberIdentifiers.add(639347);
    Bank bankObj = new Bank()
      .setNickname("pasargad")
      .setName("Pasargad Bank")
      .setPersianName("بانک پاسارگاد")
      .setIbanCode("057")
      .setAccountNumberAvailable(true)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addSarmayeh() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(639607);

    Bank bankObj = new Bank()
      .setNickname("sarmayeh")
      .setName("Sarmayeh Bank")
      .setPersianName("بانک سرمایه")
      .setIbanCode("058")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addSina() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(639346);
    Bank bankObj = new Bank()
      .setNickname("sina")
      .setName("Sina Bank")
      .setPersianName("بانک سینا")
      .setIbanCode("059")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addShahr() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(502806);
    cardNumberIdentifiers.add(504706);
    Bank bankObj = new Bank()
      .setNickname("shahr")
      .setName("City Bank")
      .setPersianName("بانک شهر")
      .setIbanCode("061")
      .setAccountNumberAvailable(true)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addAyandeh() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(636214);

    Bank bankObj = new Bank()
      .setNickname("ayandeh")
      .setName("Ayandeh Bank")
      .setPersianName("بانک آینده")
      .setIbanCode("062")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);
    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addAnsar() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(627381);

    Bank bankObj = new Bank()
      .setNickname("ansar")
      .setName("Ansar Bank")
      .setPersianName("بانک انصار")
      .setIbanCode("063")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addGardeshgari() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(505416);
    cardNumberIdentifiers.add(505426);

    Bank bankObj = new Bank()
      .setNickname("gardeshgari")
      .setName("Gardeshgari Bank")
      .setPersianName("بانک گردشگری")
      .setIbanCode("064")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addHekmatIranian() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(636949);

    Bank bankObj = new Bank()
      .setNickname("hekmat-iranian")
      .setName("Hekmat Iranian Bank")
      .setPersianName("بانک حکمت ایرانیان")
      .setIbanCode("065")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addDey() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(502938);

    Bank bankObj = new Bank()
      .setNickname("dey")
      .setName("Dey Bank")
      .setPersianName("بانک دی")
      .setIbanCode("066")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addIranZamin() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(505785);

    Bank bankObj = new Bank()
      .setNickname("iran-zamin")
      .setName("Iran Zamin Bank")
      .setPersianName("بانک ایران زمین")
      .setIbanCode("069")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addResalat() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(504172);

    Bank bankObj = new Bank()
      .setNickname("resalat")
      .setName("Resalat Bank")
      .setPersianName("بانک قرض الحسنه رسالت")
      .setIbanCode("070")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addKosar() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(505801);

    Bank bankObj = new Bank()
      .setNickname("kosar")
      .setName("Kosar Credit Institute")
      .setPersianName("موسسه اعتباری کوثر")
      .setIbanCode("073")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addMelal() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(606256);

    Bank bankObj = new Bank()
      .setNickname("melal")
      .setName("Melal Credit Institute")
      .setPersianName("موسسه اعتباری ملل")
      .setIbanCode("075")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addMiddleEastBank() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(585949);

    Bank bankObj = new Bank()
      .setNickname("middle-east-bank")
      .setName("Middle East Bank")
      .setPersianName("بانک خاورمیانه")
      .setIbanCode("078")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  //TODO
  private void addNoorBank() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    Bank bankObj = new Bank()
      .setNickname("noor-bank")
      .setName("Noor Credit Institution")
      .setPersianName("موسسه اعتباری نور")
      .setIbanCode("080")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    bankCollections.add(bankObj);
  }

  private void addMehrEqtesad() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
    cardNumberIdentifiers.add(606373);

    Bank bankObj = new Bank()
      .setNickname("mehr-eqtesad")
      .setName("Mehr Eqtesad Bank")
      .setPersianName("بانک مهر اقتصاد")
      .setIbanCode("079")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));
    bankCollections.add(bankObj);
  }

  private void addMehrIran() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    Bank bankObj = new Bank()
      .setNickname("mehr-iran")
      .setName("Mehr Iran Bank")
      .setPersianName("بانک مهر ایران")
      .setIbanCode("060")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    bankCollections.add(bankObj);
  }

  private void addIranVenezuela() {
    ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

    Bank bankObj = new Bank()
      .setNickname("iran-venezuela")
      .setName("Iran and Venezuela Bank")
      .setPersianName("بانک ایران و ونزوئلا")
      .setIbanCode("095")
      .setAccountNumberAvailable(false)
      .setCardNumberIdentifiers(cardNumberIdentifiers);

    bankCollections.add(bankObj);
  }
}
