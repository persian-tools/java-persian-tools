package dev.persiantools;

import dev.persiantools.usecases.exceptions.BankNotFoundByProvidedCardNumber;
import dev.persiantools.usecases.exceptions.BankNotFoundByProvidedIban;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BankTest
{
    @Test
    public void shouldReturnsBanksNameUsingCardNumbers()
    {
        BankUtils bank = new BankUtils();

        try {
            for(Map.Entry<String, String> entry : getBanksDetailsByIban().entrySet()) {
                String iban = entry.getKey();
                String name = entry.getValue();

                assertEquals(bank.findByIban(iban).getPersianName(), name);
            }
        } catch (BankNotFoundByProvidedIban bankNotFoundByProvidedDigits) {
            bankNotFoundByProvidedDigits.printStackTrace();
        }
    }

    @Test
    public void shouldReturnsBanksNameUsingIbans()
    {
        BankUtils bank = new BankUtils();

        try {
            for(Map.Entry<Integer, String> entry : getBanksDetailsByCardNumber().entrySet()) {
                Integer code = entry.getKey();
                String name = entry.getValue();

                assertEquals(bank.findByCardNumber(code).getPersianName(), name);
            }
        } catch (BankNotFoundByProvidedCardNumber bankNotFoundByProvidedDigits) {
            bankNotFoundByProvidedDigits.printStackTrace();
        }
    }


    private HashMap<String, String> getBanksDetailsByIban(){
        HashMap<String, String> mapping = new HashMap<>();

        mapping.put("010", "بانک مرکزی جمهوری اسلامی ایران");
        mapping.put("011", "بانک صنعت و معدن");
        mapping.put("012", "بانک ملت");
        mapping.put("013", "بانک رفاه کارگران");
        mapping.put("014", "بانک مسکن");
        mapping.put("015", "بانک سپه");
        mapping.put("016", "بانک کشاورزی");
        mapping.put("017", "بانک ملی ایران");
        mapping.put("018", "بانک تجارت");
        mapping.put("019", "بانک صادرات ایران");
        mapping.put("020", "بانک توسعه صادرات");
        mapping.put("021", "پست بانک ایران");
        mapping.put("022", "بانک توسعه تعاون");
        mapping.put("051", "موسسه اعتباری توسعه");
        mapping.put("052", "بانک قوامین");
        mapping.put("053", "بانک کارآفرین");
        mapping.put("054", "بانک پارسیان");
        mapping.put("055", "بانک اقتصاد نوین");
        mapping.put("056", "بانک سامان");
        mapping.put("057", "بانک پاسارگاد");
        mapping.put("058", "بانک سرمایه");
        mapping.put("059", "بانک سینا");
        mapping.put("060", "بانک مهر ایران");
        mapping.put("061", "بانک شهر");
        mapping.put("062", "بانک آینده");
        mapping.put("063", "بانک انصار");
        mapping.put("064", "بانک گردشگری");
        mapping.put("065", "بانک حکمت ایرانیان");
        mapping.put("066", "بانک دی");
        mapping.put("069", "بانک ایران زمین");
        mapping.put("070", "بانک قرض الحسنه رسالت");
        mapping.put("073", "موسسه اعتباری کوثر");
        mapping.put("075", "موسسه اعتباری ملل");
        mapping.put("078", "بانک خاورمیانه");
        mapping.put("080", "موسسه اعتباری نور");
        mapping.put("079", "بانک مهر اقتصاد");
        mapping.put("090", "بانک مهر ایران");
        mapping.put("095", "بانک ایران و ونزوئلا");

        return mapping;
    }

    private HashMap<Integer, String> getBanksDetailsByCardNumber(){
        HashMap<Integer, String> mapping = new HashMap<>();

        mapping.put(636214,"بانک آینده");
        mapping.put(627412,"بانک اقتصاد نوین");
        mapping.put(627381,"بانک انصار");
        mapping.put(505785,"بانک ایران زمین");
        mapping.put(622106,"بانک پارسیان");
        mapping.put(627884,"بانک پارسیان");
        mapping.put(502229,"بانک پاسارگاد");
        mapping.put(639347,"بانک پاسارگاد");
        mapping.put(627760,"پست بانک ایران");
        mapping.put(585983,"بانک تجارت");
        mapping.put(627353,"بانک تجارت");
        mapping.put(502908,"بانک توسعه تعاون");
        mapping.put(207177,"بانک توسعه صادرات");
        mapping.put(627648,"بانک توسعه صادرات");
        mapping.put(636949,"بانک حکمت ایرانیان");
        mapping.put(585949,"بانک خاورمیانه");
        mapping.put(502938,"بانک دی");
        mapping.put(504172,"بانک رسالت");
        mapping.put(589463,"بانک رفاه کارگران");
        mapping.put(621986,"بانک سامان");
        mapping.put(589210,"بانک سپه");
        mapping.put(639607,"بانک سرمایه");
        mapping.put(639346,"بانک سینا");
        mapping.put(502806,"بانک شهر");
        mapping.put(504706,"بانک شهر");
        mapping.put(603769,"بانک صادرات ایران");
        mapping.put(903769,"بانک صادرات ایران");
        mapping.put(627961,"بانک صنعت و معدن");
        mapping.put(639370,"بانک قرض الحسنه مهر");
        mapping.put(639599,"بانک قوامین");
        mapping.put(627488,"بانک کارآفرین");
        mapping.put(603770,"بانک کشاورزی");
        mapping.put(639217,"بانک کشاورزی");
        mapping.put(505416,"بانک گردشگری");
        mapping.put(505426,"بانک گردشگری");
        mapping.put(636797,"بانک مرکزی ایران");
        mapping.put(628023,"بانک مسکن");
        mapping.put(610433,"بانک ملت");
        mapping.put(991975,"بانک ملت");
        mapping.put(170019,"بانک ملی ایران");
        mapping.put(603799,"بانک ملی ایران");
        mapping.put(606373,"بانک مهر ایران");
        mapping.put(505801,"موسسه کوثر");
        mapping.put(606256,"موسسه اعتباری ملل");
        mapping.put(628157,"موسسه اعتباری توسعه");

        return mapping;
    }
}
