package com.test.problems;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] array = {3, 8, 9, 7, 6};
        int times = 5;

        CyclicRotation main = new CyclicRotation();
        main.solution(array, times);
    }

    public int[] solution(int[] A, int K) {

        System.out.println("start: " + Arrays.toString(A));
        // iterate X times
        int[] rotated = A;
        for (int i = 0; i < K; i++) {
            rotated = rotate(rotated);
            System.out.println(String.format("rotated %s: %s", i, Arrays.toString(rotated)));
        }
        return rotated;
    }

    public int[] rotate(int[] array) {
        int[] rotated = new int[array.length];

        // move last to first
        int last = array[array.length-1];
        rotated[0] = last;

        // move items to next index
        for (int i = 1; i < array.length; i++) {
            rotated[i] = array[i-1];
        }
        return rotated;
    }
}
