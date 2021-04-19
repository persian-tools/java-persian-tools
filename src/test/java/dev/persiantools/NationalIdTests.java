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


    @Test(expected = IllegalArgumentException.class)
    public void getPlaceByIranNationalId_NullNationalId_ThrowsException() {
        NationalId.getPlaceByIranNationalId(null);
        fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getPlaceByIranNationalId_BlankNationalId_ThrowsException() {
        NationalId.getPlaceByIranNationalId(" ");
        fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getPlaceByIranNationalId_InvalidFormatNationalId_ThrowsException() {
        NationalId.getPlaceByIranNationalId("some invalid national id");
        fail();
    }

    @Test
    public void getPlaceByIranNationalId_InvalidNationalId_ReturnsEmptyOptional() {
        assert NationalId.getPlaceByIranNationalId("0008454594").isEmpty();
        assert NationalId.getPlaceByIranNationalId("8881234567").isEmpty();
    }

    @Test
    public void getPlaceByIranNationalId_ValidNationalId_ReturnsHometownOptional() {
        assert NationalId.getPlaceByIranNationalId("0499370899").isPresent();
        assert NationalId.getPlaceByIranNationalId("0790419904").isPresent();
        assert NationalId.getPlaceByIranNationalId("0084575948").isPresent();
        assert NationalId.getPlaceByIranNationalId("0060495219").isPresent();
        assert NationalId.getPlaceByIranNationalId("0671658506").isPresent();
        assert NationalId.getPlaceByIranNationalId("0671658506").isPresent();
        assert NationalId.getPlaceByIranNationalId("0643005846").isPresent();
        assert NationalId.getPlaceByIranNationalId("0906582709").isPresent();
        assert NationalId.getPlaceByIranNationalId("0451727304").isPresent();
        assert NationalId.getPlaceByIranNationalId("0371359058").isPresent();
        assert NationalId.getPlaceByIranNationalId("5049478618").isPresent();
        assert NationalId.getPlaceByIranNationalId("2110990147").isPresent();
        assert NationalId.getPlaceByIranNationalId("0084545943").isPresent();
    }
}
