package dev.persiantools;

import java.util.regex.*;
public class NationalId {

    /**
     * Check National-id validation, 10-digit formatted as follows: XXX-XXXXXX-X
     * <ul>
     *     <li>the first part is hometown code something like 001</li>
     *     <li>the second part is a personal unique code</li>
     *     <li>the last part is control digit</li>
     * </ul>
     * In case of missing starting zeros (max 2 zeros),
     * it will pad the input with "0"
     * @param nationalId something like this: 1111111111
     * @return validation result
     */
    public static boolean verifyIranianNationalId(String nationalId) {

        if (nationalId == null || nationalId.isBlank())
            throw new IllegalArgumentException("Null or empty nationalId");

        if (nationalId.length() >= 8)
            nationalId = padLeftZeros(nationalId);

        Pattern pattern = Pattern.compile("^\\d{10}$");
        if (!pattern.matcher(nationalId).matches())
            return false;

        String personalUniqueNumberPart = nationalId.substring(3, 6);
        if (Integer.parseInt(personalUniqueNumberPart) == 0)
            return false;

        int controlDigit = Integer.parseInt(String.valueOf(nationalId.charAt(9)));
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(nationalId.substring(i, i + 1)) * (10 - i);
        }

        int remainder = sum % 11;
        return remainder < 2 ?
                controlDigit == remainder :
                controlDigit == 11 - remainder;
    }

    public static String padLeftZeros(String inputString) {
        return ("00" + inputString).substring(inputString.length() + 2 - 10);
    }

}
