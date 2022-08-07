package dev.persiantools;

import static org.junit.Assert.*;

import dev.persiantools.bank.Bank;
import dev.persiantools.bank.BankUtils;
import dev.persiantools.bank.exceptions.BankNotFoundByProvidedCardNumber;
import dev.persiantools.bank.exceptions.BankNotFoundByProvidedIban;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class BankUtilTest {

    @Test
    public void findByIban_withCorrectIban_returnsBandInfo() throws BankNotFoundByProvidedIban {
        Bank parsianBank = BankUtils.findByIban("IR820540102680020817909002");
        Bank pasargadBank = BankUtils.findByIban("IR550570022080013447370101");
        assertEquals(parsianBank.getNickName(), "parsian");
        assertEquals(pasargadBank.getNickName(), "pasargad");
    }

    @Test(expected = BankNotFoundByProvidedIban.class)
    public void findByIban_withInvalidIban_throwsException() throws BankNotFoundByProvidedIban {
        BankUtils.findByIban("IR820540102680020817909001");
        fail();
    }

    @Test(expected = BankNotFoundByProvidedIban.class)
    public void findByIban_withInvalidIbanCode_throwsException() throws BankNotFoundByProvidedIban {
        BankUtils.findByIban("IR980600102680020817909000");
        fail();
    }

    @Test(expected = BankNotFoundByProvidedCardNumber.class)
    public void shouldReturnsBanksNameUsingCardNumber() throws BankNotFoundByProvidedCardNumber {
        for (Map.Entry<Integer, String> entry : getBanksDetailsByCardNumber().entrySet()) {
            Integer code = entry.getKey();
            String name = entry.getValue();

            assertEquals(BankUtils.findByCardNumber(code).getNickName(), name);
        }
    }


    @SuppressWarnings("SpellCheckingInspection")
    private HashMap<Integer, String> getBanksDetailsByCardNumber() {
        HashMap<Integer, String> mapping = new HashMap<>();

        mapping.put(636214, "ayandeh");
        mapping.put(627412, "eghtesad-novin");
        mapping.put(627381, "ansar");
        mapping.put(505785, "iran-zamin");
        mapping.put(622106, "parsian");
        mapping.put(627884, "parsian");
        mapping.put(502229, "pasargad");
        mapping.put(639347, "pasargad");
        mapping.put(627760, "post");
        mapping.put(585983, "tejarat");
        mapping.put(627353, "tejarat");
        mapping.put(502908, "toose-taavon");
        mapping.put(207177, "tosee-saderat");
        mapping.put(627648, "tosee-saderat");
        mapping.put(636949, "hekmat-iranian");
        mapping.put(585949, "middle-east-bankه");
        mapping.put(502938, "dey");
        mapping.put(504172, "resalat");
        mapping.put(589463, "refah");
        mapping.put(621986, "saman");
        mapping.put(589210, "sepah");
        mapping.put(639607, "sarmayeh");
        mapping.put(639346, "sina");
        mapping.put(502806, "shahr");
        mapping.put(504706, "shahr");
        mapping.put(603769, "saderat");
        mapping.put(903769, "saderat");
        mapping.put(627961, "sanat-o-madan");
        mapping.put(639370, "بانک قرض الحسنه مهر");
        mapping.put(639599, "ghavamin");
        mapping.put(627488, "karafarin");
        mapping.put(603770, "keshavarzi");
        mapping.put(639217, "keshavarzi");
        mapping.put(505416, "gardeshgari");
        mapping.put(505426, "gardeshgari");
        mapping.put(636797, "central-bank");
        mapping.put(628023, "maskan");
        mapping.put(610433, "mellat");
        mapping.put(991975, "mellat");
        mapping.put(170019, "melli");
        mapping.put(603799, "melli");
        mapping.put(606373, "mehr-iran");
        mapping.put(505801, "kosar");
        mapping.put(606256, "melal");
        mapping.put(628157, "tosee");

        return mapping;
    }

    @Test
    public void validateCardNumber_withValidInput_returnsTrue() {
        assertTrue(BankUtils.isValidCardNumber("6037701689095443"));
        assertTrue(BankUtils.isValidCardNumber("6219861034529007"));
    }

    @Test
    public void validateCardNumber_withInvalidInput_returnsFalse() {
        assertFalse(BankUtils.isValidCardNumber("6219861034529008"));
        assertFalse(BankUtils.isValidCardNumber("621986103452900"));
        assertFalse(BankUtils.isValidCardNumber("0000000000000000"));
    }

    @Test
    public void isValidIban_withValidInputs_returnsTrue() {

        HashMap<String, Boolean> truthyIbans = new HashMap<>();
        truthyIbans.put("IR820540102680020817909002", true);
        truthyIbans.put("IR062960000000100324200001", true);
        truthyIbans.put("IR580540105180021273113007", true);

        for (Map.Entry<String, Boolean> entry : truthyIbans.entrySet()) {
            String iban = entry.getKey();
            Boolean assertion = entry.getValue();

            assertEquals((BankUtils.isValidIban(iban)), assertion);
        }
    }

    @Test
    public void isValidIban_withInvalidInputs_returnsFalse() {

        HashMap<String, Boolean> falsyIbans = new HashMap<>();
        falsyIbans.put("IR012345678901234567890123", false);
        falsyIbans.put("IR01234567890123456789", false);
        falsyIbans.put("IR012345678901234567890123456789", false);

        for (Map.Entry<String, Boolean> entry : falsyIbans.entrySet()) {
            String iban = entry.getKey();
            Boolean assertion = entry.getValue();

            assertEquals((BankUtils.isValidIban(iban)), assertion);
        }
    }
}
