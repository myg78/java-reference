package com.test.hackerrank.flippingbits;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here

//        char[] chars = String.valueOf(n).toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//            if (chars[i] != '0' && chars[i] != '1') {
//                System.out.println("ret:");
////                return n + 1;
//            }
//        }
//
//        System.out.println("n: " + n);
//        String s = Long.toBinaryString(n);
//        System.out.println("s: " + s);

        String num = String.format("%032d", n);
        System.out.println(num);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (ch == '1') sb.append("0");
            if (ch == '0') sb.append("1");
        }
        System.out.println(sb.toString());

        long result = Long.parseLong(sb.toString(), 2);
        System.out.println(result);

        return result;
//         return Integer.toUnsignedLong(~(int) n);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        long result = Result.flippingBits(0);
//        long result = Result.flippingBits(2147483647);
//        long result = Result.flippingBits(4294967294);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                long n = Long.parseLong(bufferedReader.readLine().trim());
//
//                long result = Result.flippingBits(n);
//
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
