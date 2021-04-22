package dev.persiantools.usecases.collections;

import dev.persiantools.commons.Bank;

import java.util.ArrayList;
import java.util.TreeMap;

public class BanksCollection {

    private static BanksCollection instance;
    private final TreeMap<Integer, Bank> cardNumberMapping = new TreeMap<>();

    private BanksCollection() {
    }

    public static BanksCollection getInstance() {

        if (instance == null) {
            synchronized (BanksCollection.class) {
                if (instance == null) {
                    instance = new BanksCollection();
                    instance.addBanks();
                }
            }
        }

        return instance;
    }

    private void addBanks() {

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

    public TreeMap<Integer, Bank> getCardNumberMapping() {
        return cardNumberMapping;
    }

    private void addCentralBank() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        cardNumberIdentifiers.add(636797);

        String nickname = "central-bank";
        String name = "Central Bank of Iran";
        String persianName = "بانک مرکزی جمهوری اسلامی ایران";
        String ibanCode = "010";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addSanatOMadan() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        cardNumberIdentifiers.add(627961);

        String nickname = "sanat-o-madan";
        String name = "Sanat O Madan Bank";
        String persianName = "بانک صنعت و معدن";
        String ibanCode = "011";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addMellat() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        cardNumberIdentifiers.add(610433);
        cardNumberIdentifiers.add(991975);

        String nickname = "mellat";
        String name = "Mellat Bank";
        String persianName = "بانک ملت";
        String ibanCode = "012";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addRefah() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(589463);

        String nickname = "refah";
        String name = "Refah Bank";
        String persianName = "بانک رفاه کارگران";
        String ibanCode = "013";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addMaskan() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(628023);

        String nickname = "maskan";
        String name = "Maskan Bank";
        String persianName = "بانک مسکن";
        String ibanCode = "014";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addSepah() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(589210);

        String nickname = "sepah";
        String name = "Sepah Bank";
        String persianName = "بانک سپه";
        String ibanCode = "015";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addKeshavarzi() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        cardNumberIdentifiers.add(603770);
        cardNumberIdentifiers.add(639217);

        String nickname = "keshavarzi";
        String name = "Keshavarzi";
        String persianName = "بانک کشاورزی";
        String ibanCode = "016";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addMelli() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        cardNumberIdentifiers.add(170019);
        cardNumberIdentifiers.add(603799);

        String nickname = "melli";
        String name = "Melli";
        String persianName = "بانک ملی ایران";
        String ibanCode = "017";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addTejarat() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        cardNumberIdentifiers.add(585983);
        cardNumberIdentifiers.add(627353);

        String nickname = "tejarat";
        String name = "Tejarat Bank";
        String persianName = "بانک تجارت";
        String ibanCode = "018";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addSaderat() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        cardNumberIdentifiers.add(207177);
        cardNumberIdentifiers.add(627648);
        String nickname = "saderat";
        String name = "Saderat Bank";
        String persianName = "بانک صادرات ایران";
        String ibanCode = "019";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addToseeSaderat() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        cardNumberIdentifiers.add(207177);
        cardNumberIdentifiers.add(627648);

        String nickname = "tosee-saderat";
        String name = "Tose Saderat Bank";
        String persianName = "بانک توسعه صادرات";
        String ibanCode = "020";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addPost() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(627760);

        String nickname = "post";
        String name = "Post Bank";
        String persianName = "پست بانک ایران";
        String ibanCode = "021";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addTooaddaavon() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(502908);

        String nickname = "toose-taavon";
        String name = "Tosee Taavon Bank";
        String persianName = "بانک توسعه تعاون";
        String ibanCode = "022";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();
        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addTosee() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(628157);

        String nickname = "tosee";
        String name = "Tosee Bank";
        String persianName = "موسسه اعتباری توسعه";
        String ibanCode = "051";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();
        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addGhavamin() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        cardNumberIdentifiers.add(639599);

        String nickname = "ghavamin";
        String name = "Ghavamin Bank";
        String persianName = "بانک قوامین";
        String ibanCode = "052";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addKarafarin() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(627488);

        String nickname = "karafarin";
        String name = "Karafarin Bank";
        String persianName = "بانک کارآفرین";
        String ibanCode = "053";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();
        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addParsian() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(622106);
        cardNumberIdentifiers.add(627884);
        String nickname = "parsian";
        String name = "Parsian Bank";
        String persianName = "بانک پارسیان";
        String ibanCode = "054";
        boolean accountNumberAvailable = true;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addEghtesadNovin() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(627412);

        String nickname = "eghtesad-novin";
        String name = "Eghtesad Novin Bank";
        String persianName = "بانک اقتصاد نوین";
        String ibanCode = "055";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();
        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addSaman() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(621986);

        String nickname = "saman";
        String name = "Saman Bank";
        String persianName = "بانک سامان";
        String ibanCode = "056";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();
        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addPasargad() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(502229);
        cardNumberIdentifiers.add(639347);

        String nickname = "pasargad";
        String name = "Pasargad Bank";
        String persianName = "بانک پاسارگاد";
        String ibanCode = "057";
        boolean accountNumberAvailable = true;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();
        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addSarmayeh() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(639607);

        String nickname = "sarmayeh";
        String name = "Sarmayeh Bank";
        String persianName = "بانک سرمایه";
        String ibanCode = "058";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addSina() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(639346);

        String nickname = "sina";
        String name = "Sina Bank";
        String persianName = "بانک سینا";
        String ibanCode = "059";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();
        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addShahr() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(502806);
        cardNumberIdentifiers.add(504706);

        String nickname = "shahr";
        String name = "City Bank";
        String persianName = "بانک شهر";
        String ibanCode = "061";
        boolean accountNumberAvailable = true;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();
        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addAyandeh() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(636214);

        String nickname = "ayandeh";
        String name = "Ayandeh Bank";
        String persianName = "بانک آینده";
        String ibanCode = "062";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();
        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addAnsar() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(627381);

        String nickname = "ansar";
        String name = "Ansar Bank";
        String persianName = "بانک انصار";
        String ibanCode = "063";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addGardeshgari() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(505416);
        cardNumberIdentifiers.add(505426);

        String nickname = "gardeshgari";
        String name = "Gardeshgari Bank";
        String persianName = "بانک گردشگری";
        String ibanCode = "064";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addHekmatIranian() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(636949);

        String nickname = "hekmat-iranian";
        String name = "Hekmat Iranian Bank";
        String persianName = "بانک حکمت ایرانیان";
        String ibanCode = "065";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addDey() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(502938);

        String nickname = "dey";
        String name = "Dey Bank";
        String persianName = "بانک دی";
        String ibanCode = "066";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addIranZamin() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(505785);

        String nickname = "iran-zamin";
        String name = "Iran Zamin Bank";
        String persianName = "بانک ایران زمین";
        String ibanCode = "069";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addResalat() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(504172);

        String nickname = "resalat";
        String name = "Resalat Bank";
        String persianName = "بانک قرض الحسنه رسالت";
        String ibanCode = "070";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addKosar() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(505801);

        String nickname = "kosar";
        String name = "Kosar Credit Institute";
        String persianName = "موسسه اعتباری کوثر";
        String ibanCode = "073";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addMelal() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(606256);

        String nickname = "melal";
        String name = "Melal Credit Institute";
        String persianName = "موسسه اعتباری ملل";
        String ibanCode = "075";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addMiddleEastBank() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(585949);

        String nickname = "middle-east-bank";
        String name = "Middle East Bank";
        String persianName = "بانک خاورمیانه";
        String ibanCode = "078";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    //TODO
    private void addNoorBank() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        String nickname = "noor-bank";
        String name = "Noor Credit Institution";
        String persianName = "موسسه اعتباری نور";
        String ibanCode = "080";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();


    }

    private void addMehrEqtesad() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();
        cardNumberIdentifiers.add(606373);

        String nickname = "mehr-eqtesad";
        String name = "Mehr Eqtesad Bank";
        String persianName = "بانک مهر اقتصاد";
        String ibanCode = "079";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();

        cardNumberIdentifiers.forEach(identifier -> cardNumberMapping.put(identifier, bankObj));

    }

    private void addMehrIran() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        String nickname = "mehr-iran";
        String name = "Mehr Iran Bank";
        String persianName = "بانک مهر ایران";
        String ibanCode = "090";
        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();


    }

    private void addIranVenezuela() {
        ArrayList<Integer> cardNumberIdentifiers = new ArrayList<>();

        String nickname = "iran-venezuela";
        String name = "Iran and Venezuela Bank";
        String persianName = "بانک ایران و ونزوئلا";
        String ibanCode = "095";

        boolean accountNumberAvailable = false;

        Bank bankObj = new Bank
                .Builder()
                .withNickName(nickname)
                .withName(name)
                .withPersianName(persianName)
                .withIbanCode(ibanCode)
                .withCardNumberIdentifiers(cardNumberIdentifiers)
                .isAccountNumberAvailable(accountNumberAvailable)
                .make();


    }
}
