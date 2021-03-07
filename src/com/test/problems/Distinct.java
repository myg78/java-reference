package com.test.problems;

import java.util.Arrays;

public class Distinct {

    public static void main(String[] args) {
        Distinct distinct = new Distinct();
        int[] array = {2,1,1,2,3,1};
        int solution = distinct.solution(array);
        System.out.println("solution: " + solution);
    }

    public int solution(int[] array) {
        return (int) Arrays.stream(array).distinct().count();
    }

}
