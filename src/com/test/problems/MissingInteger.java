package com.test.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static void main(String[] args) {

        // empty
        //int[] array = {};

        // single element
        //int[] array = {1}; // 2
        //int[] array = {0}; // 1
        //int[] array = {-2}; // 1
        //int[] array = {-1}; // 1
        //int[] array = {-1000000}; // 1

        // double element
//        int[] array = {0,1}; // 2
//        int[] array = {3,2}; // 1

        // inside of range
        int[] array = {1, 3, 6, 4, 1, 2}; // 5
//        int[] array = {1, 3, 6, 4}; // 2

        // outside of range
//        int[] array = {1, 2, 3}; // 4

        // negative numbers
//        int[] array = {-1, -3}; // 1

        MissingInteger missingInteger = new MissingInteger();
        int solution = missingInteger.solution(array);
        System.out.println("solution: " + solution);
    }

    public int solution(int[] array) {
        Arrays.sort(array);
        int min = 1;
        Set<Integer> set = new HashSet<>();
        // add unique positive numbers to set
        for (int i = 0; i < array.length; i++) {
            System.out.println(String.format("i[%s] = %s", i, array[i]));
            if (array[i] > 0) {
                set.add(array[i]);
            }
        }
        // increment minimum until not found in set
        while (set.contains(min)) {
            min++;
        }
        System.out.println("min: " + min);
        return min;
    }

}
