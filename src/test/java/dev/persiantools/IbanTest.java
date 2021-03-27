package dev.persiantools;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class IbanTest {

  @Test
  public void shouldValidateIBANsCorrectly() {
    IbanUtils ibanValidator = new IbanUtils();

    for (Map.Entry<String, Boolean> entry : getIbans().entrySet()) {
      String iban = entry.getKey();
      Boolean assertion = entry.getValue();

      assertEquals((ibanValidator.isValid(iban)), assertion);
    }
  }

  private HashMap<String, Boolean> getIbans() {
    HashMap<String, Boolean> ibanCollection = new HashMap<>();

    ibanCollection.put("IR820540102680020817909002", true);
    ibanCollection.put("IR062960000000100324200001", true);
    ibanCollection.put("IR580540105180021273113007", true);
    ibanCollection.put("IR012345678901234567890123", false);
    ibanCollection.put("IR01234567890123456789", false);
    ibanCollection.put("IR012345678901234567890123456789", false);

    return ibanCollection;
  }
}
