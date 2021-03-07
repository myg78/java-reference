package com.test.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 * <p>
 * ============================================================================================================
 * Array size 2 to 100,000
 * Array int values from -1000 to 1000
 */
public class TapeEquilibrium {

    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

        // test cases - expected output
        // int[] array = {3, 1, 2, 4, 3}; // 1

        // array empty
//        int[] array = {}; // assume default response to 0

        // array size 1
//        int[] array = {10}; // assume default response to 0

        // array size 2
//        int[] array = {1, 2}; // 1
//        int[] array = {2, 2}; // 1
//        int[] array = {4, 16}; // 12
//        int[] array = {26, 5}; // 21
//        int[] array = {-2, 5}; // 7
//        int[] array = {-2, -5};

        // positive
//        int[] array = {1, 2, 6, 7};

        // negative
//        int[] array = {-10, 2, 6, 7};

        // edge int values
//        int[] array = {3, 1, 2, 4, 3, 1000};
//        int[] array = {1000, 456, 2, 48, 33};
        int[] array = {1000, 456, -1000, 48, 33};

        int solution = tapeEquilibrium.solution(array);
        System.out.println("solution: " + solution);
    }

    // Preference on Streams-based approach
    public int solution(int[] array) {

        List<Integer> list = new ArrayList<>();

        // iterate array based on length
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("i: " + i);

            // split array to left and right
            int[] left = Arrays.copyOfRange(array, 0, i + 1);
            int[] right = Arrays.copyOfRange(array, i + 1, array.length);
            System.out.println(String.format("split: %s : %s", Arrays.toString(left), Arrays.toString(right)));

            // sum each part and compute absolute difference
            int leftSum = Arrays.stream(left).sum();
            int rightSum = Arrays.stream(right).sum();
            int absDiff = Math.abs(leftSum - rightSum);
            System.out.println(String.format("compute: %s - %s = %s", leftSum, rightSum, absDiff));

            // save absolute difference
            list.add(absDiff);
        }

        // find smallest by sorting then find first element
        return list.stream().sorted().findFirst().orElse(0);
    }

}
