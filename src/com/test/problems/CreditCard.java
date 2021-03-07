package com.test.problems;

import java.util.Arrays;

public class CreditCard {

    public static void main(String[] args) {
//        validateCard(123456789012d);
//        validateCard(12345678901234d);
//        validateCard(1234567890123456789d);
//        validateCard(12345678901234567890d);
//        validateCard(12345678901234567890d);
//        validateCard(12345678901d);
        validateCard(1234567890123456d); // false
        validateCard(1234567890123452d); // true
    }

    public static boolean validateCard(double number) {
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("number: " + number);
        // validate length
        boolean validLength = isValidLength(number);
        if (!validLength) return false;

        // split digits
        String numberStr = String.format("%.0f", number);
        String digits = numberStr.substring(0, numberStr.length()-1);
        String checkDigit = numberStr.substring(numberStr.length()-1);

        // reverse
        String reverse = reverse(digits);
        System.out.println("reverse: " + reverse);

        // compute double in odd positions
        int[] ints = selectiveDouble(reverse);
        System.out.println("ints: " + Arrays.toString(ints));

        // sum digits
        int sum = Arrays.stream(ints).sum();
        System.out.println("sum: " + sum);

        // validate check digit
        boolean valid = validateCheckDigit(lastDigit(sum), Integer.parseInt(checkDigit));
        System.out.println("valid: " + valid);
        return valid;
    }

    private static boolean validateCheckDigit(int sumDigit, int checkDigit) {
        System.out.println("check: " + checkDigit);
        return (10 - sumDigit) == checkDigit;
    }

    private static int[] selectiveDouble(String number) {
        char[] chars = number.toCharArray();
        int[] arr = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int current = Character.getNumericValue(chars[i]);
            if (i % 2 == 0) { // compute odd digits
                arr[i] = computeDouble(current);
            } else { // retain even
                arr[i] = current;
            }
        }
        return arr;
    }

    private static int computeDouble(int number) {
        int doubled = number * 2;
        return (doubled > 9) ? addDigits(doubled) : doubled;
    }

    private static int addDigits(int number) {
        int sum = 0;
        char[] chars = String.valueOf(number).toCharArray();
        for (char aChar : chars) {
            sum = sum + Character.getNumericValue(aChar);
        }
        return sum;
    }

    private static boolean isValidLength(double number) {
        int length = (int) (Math.log10(number) + 1);
        return length >= 14 && length <= 19;
    }

    private static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    private static int lastDigit(int number) {
        return Math.abs(number) % 10;
    }

}
