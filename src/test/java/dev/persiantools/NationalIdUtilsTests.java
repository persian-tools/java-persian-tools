package dev.persiantools;

import dev.persiantools.nationalid.NationalIdUtils;
import org.junit.*;

import static org.junit.Assert.fail;

public class NationalIdUtilsTests {

    @Test(expected = IllegalArgumentException.class)
    public void validateNationalId_NullNationalId_ThrowsException() {
        NationalIdUtils.verifyIranianNationalId(null);
        fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateNationalId_BlankNationalId_ThrowsException() {
        NationalIdUtils.verifyIranianNationalId(" ");
        fail();
    }

    @Test
    public void validateNationalId_WithoutStartingZeros_ReturnsTrue() {
        String nationalId = "67749828"; // 0067749828
        boolean result = NationalIdUtils.verifyIranianNationalId(nationalId);
        assert result;
    }

    @Test
    public void validateNationalId_LessThanEightDigit_ReturnsFalse() {
        String nationalId = "7731689"; // 7 digits
        boolean result = NationalIdUtils.verifyIranianNationalId(nationalId);
        assert !result;
    }

    @Test
    public void validateNationalId_MoreThanTenDigit_ReturnsFalse() {
        String nationalId = "77316899512"; // 11 digits
        boolean result = NationalIdUtils.verifyIranianNationalId(nationalId);
        assert !result;
    }

    @Test
    public void validateNationalId_InvalidNationalId_ReturnsFalse() {
        assert !NationalIdUtils.verifyIranianNationalId("123000000");
        assert !NationalIdUtils.verifyIranianNationalId("0000000000");
        assert !NationalIdUtils.verifyIranianNationalId("0684159415");
    }

    @Test
    public void validateNationalId_ValidNationalId_ReturnsTrue() {
        assert NationalIdUtils.verifyIranianNationalId("0499370899");
        assert NationalIdUtils.verifyIranianNationalId("1111111111");
        assert NationalIdUtils.verifyIranianNationalId("0790419904");
        assert NationalIdUtils.verifyIranianNationalId("0084575948");
        assert NationalIdUtils.verifyIranianNationalId("0963695398");
        assert NationalIdUtils.verifyIranianNationalId("0684159414");
        assert NationalIdUtils.verifyIranianNationalId("0067749828");
        assert NationalIdUtils.verifyIranianNationalId("0650451252");
        assert NationalIdUtils.verifyIranianNationalId("1583250689");
        assert NationalIdUtils.verifyIranianNationalId("4032152314");
        assert NationalIdUtils.verifyIranianNationalId("0076229645");
        assert NationalIdUtils.verifyIranianNationalId("4271467685");
        assert NationalIdUtils.verifyIranianNationalId("0200203241");
    }


    @Test(expected = IllegalArgumentException.class)
    public void getPlaceByIranNationalId_NullNationalId_ThrowsException() {
        NationalIdUtils.getPlaceByIranNationalId(null);
        fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getPlaceByIranNationalId_BlankNationalId_ThrowsException() {
        NationalIdUtils.getPlaceByIranNationalId(" ");
        fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getPlaceByIranNationalId_InvalidFormatNationalId_ThrowsException() {
        NationalIdUtils.getPlaceByIranNationalId("some invalid national id");
        fail();
    }

    @Test
    public void getPlaceByIranNationalId_InvalidHometownCode_ReturnsEmptyList() {
        assert NationalIdUtils.getPlaceByIranNationalId("0008454594").isEmpty();
        assert NationalIdUtils.getPlaceByIranNationalId("8881234567").isEmpty();
    }

    @Test
    public void getPlaceByIranNationalId_ValidNationalId_ReturnsHometownsList() {
        assert NationalIdUtils.getPlaceByIranNationalId("0499370899").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("0790419904").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("0084575948").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("0060495219").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("0671658506").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("0671658506").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("0643005846").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("0906582709").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("0451727304").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("0371359058").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("5049478618").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("2110990147").size() != 0;
        assert NationalIdUtils.getPlaceByIranNationalId("0084545943").size() != 0;
    }

    @Test
    public void getPlaceByIranNationalId_SpecificHometownCode_ReturnsTwoItems() {
        assert NationalIdUtils.getPlaceByIranNationalId("2530000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("2880000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("3050000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("3130000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("3370000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("3820000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("3850000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("3860000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("3950000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("4830000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("5930000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("6150000000").size() == 2;
        assert NationalIdUtils.getPlaceByIranNationalId("6230000000").size() == 2;
    }
}
