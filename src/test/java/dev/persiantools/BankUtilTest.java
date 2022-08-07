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
    public void findByIban_withCorrectIban_returnsBankInfo() throws BankNotFoundByProvidedIban {
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

    @Test
    public void findByCardNumber_withCorrectCardNumber_returnsBankInfo() throws BankNotFoundByProvidedCardNumber {
        assertEquals(BankUtils.findByCardNumber("6037701689095443").getNickName(), "keshavarzi");
        assertEquals(BankUtils.findByCardNumber("6219861034529007").getNickName(), "saman");
    }

    @Test(expected = BankNotFoundByProvidedCardNumber.class)
    public void findByCardNumber_withInvalidCardNumber_throwsException() throws BankNotFoundByProvidedCardNumber {
        BankUtils.findByCardNumber("621986103452900");
        fail();
    }

    @Test(expected = BankNotFoundByProvidedCardNumber.class)
    public void findByCardNumber_withInvalidCardNumberCode_throwsException() throws BankNotFoundByProvidedCardNumber {
        BankUtils.findByCardNumber("9999991034529002");
        fail();
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
