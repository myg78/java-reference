package com.test.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayRotate {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        rotateLeft(array, 0);
        rotateLeft(array, 1);
        rotateLeft(array, 2);
        rotateLeft(array, 3);
        rotateLeft(array, 4);
        rotateLeft(array, 5);
        rotateLeft(array, 6);
        rotateLeft(array, 7);
        rotateLeft(array, 10);
        rotateLeft(array, 11);
        rotateLeft(array, 993);
        rotateLeft(array, -1);
    }

    public static void rotateLeft(int[] array, int places) {
        if (places < 0) return;
        places = places > array.length ? places % array.length : places;
        int[] left = Arrays.copyOfRange(array, 0, places);
        int[] right = Arrays.copyOfRange(array, places, array.length);
        int[] rotated = IntStream.concat(Arrays.stream(right), Arrays.stream(left)).toArray();
        System.out.println(String.format("%s - %s - %s", Arrays.toString(array), places, Arrays.toString(rotated)));
    }

}
