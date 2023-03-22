package com.test.hackerrank.recursivedigitsum;

import java.io.IOException;

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        // Write your code here

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(n);
        }
        String input = sb.toString();
        // String input = String.valueOf(n).repeat(Math.max(0, k));

        String baseNum = input;
        while (baseNum.length() > 1) {
            Integer sum = addDigits(baseNum);
            baseNum = String.valueOf(sum);
        }
        System.out.println(baseNum);
        return Integer.parseInt(baseNum);
    }

    private static Integer addDigits(String text) {
        System.out.println(text);
        char[] chars = text.toCharArray();
        int sum = 0;
        for (char aChar : chars) {
            int charInt = Character.getNumericValue(aChar);
            sum = sum + charInt;
        }
        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Result.superDigit("9875", 4);
//        Result.superDigit("9875987598759875", 3);
//        Result.superDigit("148", 3);
//        Result.superDigit("123", 3);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        String n = firstMultipleInput[0];
//
//        int k = Integer.parseInt(firstMultipleInput[1]);
//
//        int result = Result.superDigit(n, k);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
