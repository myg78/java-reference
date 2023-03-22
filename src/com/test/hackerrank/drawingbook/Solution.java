package com.test.hackerrank.drawingbook;

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
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */
    // n = pages, p = target page
    public static int pageCount(int n, int p) {
        // Write your code here

        // count from start
        int countStart = p/2;
//        System.out.println(countStart);

        // count from end
        int countEnd = n/2;
        System.out.println(countEnd);

        // get min of both

        return 0;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Result.pageCount(5, 4);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int p = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int result = Result.pageCount(n, p);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
