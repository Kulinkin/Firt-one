package lesson5;

/**
 * Created by Артём on 26.02.2017.
 */
public class RomanNumber {
    public static void main(String[] args) {
        String romanNumber = "MCDLIV";
        System.out.println(RomanNumberToArabic(romanNumber));
    }
    public static int romanValueToArabic(char romanValue) {
        switch (romanValue) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return -1;
        }
    }
    public static int RomanNumberToArabic(String romanNumber) {
        int resultArabic = 0;
        int romanLength = romanNumber.length();
        for (int i = 0; i < romanLength; i++) {
            int arabicSum;
            int romanCurrentValue = romanValueToArabic(romanNumber.charAt(i));
            if (i == (romanLength - 1)) {
                arabicSum = romanCurrentValue;
            } else {
                int romanValueNextIndex = romanValueToArabic(romanNumber.charAt(i + 1));
                if (romanCurrentValue < romanValueNextIndex) {
                    arabicSum = romanValueNextIndex - romanCurrentValue;
                    i++;
                } else {
                    arabicSum = romanCurrentValue;
                }
            }
            resultArabic += arabicSum;
        }
        return resultArabic;
    }
}
