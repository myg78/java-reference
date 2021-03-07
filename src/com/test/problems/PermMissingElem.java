package com.test.problems;

import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        int[] array = {2,3,1,5}; // 4
//        int[] array = {2,4,1,5}; // 3
//        int[] array = {1,4,3,5,7,6}; // 2
//        int[] array = {2,1,5,3}; // 4
//        int[] array = {}; // 1
//        int[] array = {3,1}; // 2
//        int[] array = {2}; // 1
//        int[] array = {1}; // 2
        int solution = permMissingElem.solution(array);
        System.out.println("solution: " + solution);
    }

    public int solution(int[] array) {
        int missing = 0;
        if (array.length < 2) return array.length+1;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(String.format("i: %s - %s", i+1, array[i]));
            if (i+1 != array[i]) {
                missing = i+1;
                break;
            }
        }
        return missing;
    }
}
