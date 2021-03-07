package com.test.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysUtil {

    public static void main(String[] args) {
        staticMethods();
    }

    public static void staticMethods() {
//        format();
//        convert();
//        iterate();
//        copy();
//        sort();
//        compare();
        fill();
    }

    public static void format() {
        int[] ints = {1, 2, 3, 4};
        System.out.println(ints);
        System.out.println(Arrays.toString(ints));

        String[] strings = {"the", "quick", "brown"};
        System.out.println(strings);
        System.out.println("array: " + Arrays.toString(strings));
    }

    public static void convert() {
        // list
        String[] strings = {"the", "quick", "brown"};
        List<String> list = Arrays.asList(strings);
        System.out.println("list: " + list);
    }

    public static void iterate() {
        // stream
        int[] ints = {1, 2, 3, 4};
        IntStream stream = Arrays.stream(ints);
        stream.forEach(System.out::println);
    }

    public static void copy() {
        int[] nums = {10, 11, 12, 13, 14};
        System.out.println(Arrays.toString(Arrays.copyOf(nums, nums.length)));
        System.out.println(Arrays.toString(Arrays.copyOf(nums, nums.length - 1)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 1, 3)));
    }

    public static void sort() {
        int[] unsorted = {5,3,9,7,6,1};
        int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(unsorted));
        System.out.println(Arrays.toString(sorted));
    }

    public static void compare() {
        // equals
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, Arrays.copyOf(arr1, arr1.length)));

        // compare
        System.out.println(Arrays.compare(arr1, arr2));
        System.out.println(Arrays.compare(arr2, arr1));
        System.out.println(Arrays.compare(arr1, Arrays.copyOf(arr1, arr1.length)));

        int[] arr3 = {2, 2, 3, 4, 4};
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.compare(arr3, arr4));
        System.out.println(Arrays.compare(arr3, Arrays.copyOf(arr3, 2)));
    }

    public static void fill() {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ints));
        Arrays.fill(ints, 5);
        System.out.println(Arrays.toString(ints));
        Arrays.fill(ints, 2, 4, 0);
        System.out.println(Arrays.toString(ints));
    }

    public static void test() {
    }
}
