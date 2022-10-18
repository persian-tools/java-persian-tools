package dev.persiantools.number;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static String numberToWords(long number) {
        return numberToWords(number, false);
    }

    public static String numberToWords(long number, boolean isOrdinal) {
        if (number == 0) return "صفر";
        String result = number < 0 ?
                addNegativeSuffix(performer(Math.abs(number))) :
                performer(Math.abs(number));
        return isOrdinal ? addOrdinalSuffix(result) : result;
    }

    private static String performer(long number){
        if (number <= 999) return transformToWord(number);

        String[] separated = String.format("%,d", number).split(",");

        List<String> numbersArray = new ArrayList<>();
        for(int i = 0; i < separated.length; i++) {
            String transformedVal = transformToWord(Integer.parseInt(separated[i]));
            String unitName = getUnitName((separated.length - (i +1)) * 3);
            if (transformedVal.length() > 1) {
                numbersArray.add(transformedVal + " " + unitName);
            }
        }
        return String.join(" و ", numbersArray).trim();
    }

    private static String transformToWord(long number) {
        if (number == 0)
            return "";
        if (number <= 9)
            return getWord(number);
        else if (number >= 11 && number <= 19)
            return getWord(number);

		var residual = number <= 99 ? number % 10 : number % 100;
        return residual == 0 ?
                getWord(number) :
                String.format("%s و %s", getWord(number - residual), transformToWord(residual));
    }

    private static String getUnitName(int numberOfZeros) {
        if(numberOfZeros == 0)
            return "";
        return NumbersWordMap.getInstance().find((long)Math.pow(10, numberOfZeros));
    }

    private static String getWord(long number) {
        return NumbersWordMap.getInstance().find(number);
    }

    private static String addNegativeSuffix(String number) {
        return "منفی " + number;
    }

    private static String addOrdinalSuffix(String number) {
        if (number.endsWith("ی")) {
            return number + " اُم";
        }

        if (number.endsWith("سه")) {
            return number.substring(0, number.length() - 2) + "سوم";
        }

        return number + "م";
    }
}
