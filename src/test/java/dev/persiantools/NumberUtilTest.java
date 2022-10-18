package dev.persiantools;

import static org.junit.Assert.*;

import dev.persiantools.number.NumberUtils;
import org.junit.Test;

public class NumberUtilTest {

    @Test
    public void numberToWords_withValidInput_returnCorrespondWord() {
        assertEquals("چهار", NumberUtils.numberToWords(4));
        assertEquals("سی و سه", NumberUtils.numberToWords(33));
        assertEquals("هشت هزار و سیصد و پنجاه و شش", NumberUtils.numberToWords(8356));
        assertEquals("پانصد هزار و چهار صد و چهل و سه", NumberUtils.numberToWords(500443));
        assertEquals("سی میلیارد", NumberUtils.numberToWords(30000000000L));
        assertEquals("نه صد و هشتاد و هفت میلیون و شش صد و پنجاه و چهار هزار و سیصد و بیست و یک", NumberUtils.numberToWords(987654321));
        assertEquals("نه کوآدریلیون و شش تریلیون و صد و نود و نه میلیارد و دویست و پنجاه و چهار میلیون و هفت صد و چهل هزار و نه صد و نود و دو", NumberUtils.numberToWords(9006199254740992L));
        assertEquals("صفر", NumberUtils.numberToWords(0, true));

        assertEquals("پانصد هزار و چهار صد و چهل و سوم", NumberUtils.numberToWords(500443, true));
        assertEquals("منفی سی اُم", NumberUtils.numberToWords(-30, true));
        assertEquals("منفی صد و بیست و سوم", NumberUtils.numberToWords(-123, true));
        assertEquals("سی و سوم", NumberUtils.numberToWords(33, true));
        assertEquals("چهل و پنجم", NumberUtils.numberToWords(45, true));
    }

}
