package dev.persiantools;

import org.junit.*;

import static org.junit.Assert.fail;

public class NationalIdTests {

    @Test(expected = IllegalArgumentException.class)
    public void validateNationalId_NullNationalId_ThrowsException() {
        NationalId.verifyIranianNationalId(null);
        fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateNationalId_BlankNationalId_ThrowsException() {
        NationalId.verifyIranianNationalId(" ");
        fail();
    }

    @Test
    public void validateNationalId_WithoutStartingZeros_ReturnsTrue() {
        String nationalId = "67749828"; // 0067749828
        boolean result = NationalId.verifyIranianNationalId(nationalId);
        assert result;
    }

    @Test
    public void validateNationalId_LessThanEightDigit_ReturnsFalse() {
        String nationalId = "7731689"; // 7 digits
        boolean result = NationalId.verifyIranianNationalId(nationalId);
        assert !result;
    }

    @Test
    public void validateNationalId_MoreThanTenDigit_ReturnsFalse() {
        String nationalId = "77316899512"; // 11 digits
        boolean result = NationalId.verifyIranianNationalId(nationalId);
        assert !result;
    }

    @Test
    public void validateNationalId_InvalidNationalId_ReturnsFalse() {
        assert !NationalId.verifyIranianNationalId("123000000");
        assert !NationalId.verifyIranianNationalId("0000000000");
        assert !NationalId.verifyIranianNationalId("0684159415");
    }

    @Test
    public void validateNationalId_ValidNationalId_ReturnsTrue() {
        assert NationalId.verifyIranianNationalId("0499370899");
        assert NationalId.verifyIranianNationalId("1111111111");
        assert NationalId.verifyIranianNationalId("0790419904");
        assert NationalId.verifyIranianNationalId("0084575948");
        assert NationalId.verifyIranianNationalId("0963695398");
        assert NationalId.verifyIranianNationalId("0684159414");
        assert NationalId.verifyIranianNationalId("0067749828");
        assert NationalId.verifyIranianNationalId("0650451252");
        assert NationalId.verifyIranianNationalId("1583250689");
        assert NationalId.verifyIranianNationalId("4032152314");
        assert NationalId.verifyIranianNationalId("0076229645");
        assert NationalId.verifyIranianNationalId("4271467685");
        assert NationalId.verifyIranianNationalId("0200203241");
    }

}
