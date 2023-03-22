package com.test.reference;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysTest {

    public static void main(String[] args) {

        // arrays
        String[] array = new String[] {"the", "quick", "brown", "fox"};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.stream(array).collect(Collectors.toList()));
        System.out.println(Arrays.asList("hey", "there"));

        // sub array
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, 1, 3)));

        // binary search
        int[] nums = {1,2,2,3,4,5,6};
        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 7));
        System.out.println(Arrays.binarySearch(nums, 2));
    }

}
