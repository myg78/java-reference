package com.test.hackerrank.plusminus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        long countPositive = arr.stream().filter(i -> i > 0).count();
        long countNegative = arr.stream().filter(i -> i < 0).count();
        long countZero = arr.stream().filter(i -> i == 0).count();
        int size = arr.size();

        print((float) countPositive/size);
        print((float) countNegative/size);
        print((float) countZero/size);
    }

    private static void print(float input) {
        System.out.printf("%.6f%n", input);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
