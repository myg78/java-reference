package com.test.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DemoTask {

    public int solution(int[] array) {
        Arrays.sort(array);
        Set<Integer> numbers = new HashSet<>();
        int currentMin = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println(String.format("i: %s : %s", i, array[i]));
            numbers.add(array[i]);
        }
        System.out.println("set: " + numbers);
        while(numbers.contains(currentMin)) {
            currentMin++;
        }
        System.out.println("currentMin: " + currentMin);
        return currentMin;
    }

    public static void main(String[] args) {
//        DemoTask.test(5, new int[]{1, 3, 6, 4, 1, 2});
//        DemoTask.test(4, new int[]{1, 2, 3});
//        DemoTask.test(1, new int[]{-1, -3});
//        DemoTask.test(1, new int[]{});
//        DemoTask.test(2, new int[]{1});
//        DemoTask.test(1, new int[]{2});
        DemoTask.test(2, new int[]{1,34,889,1000000});
    }

    public static void test(int expected, int[] input) {
        DemoTask demoTask = new DemoTask();
        int solution = demoTask.solution(input);
        boolean result = solution == expected;
        String pass = result ? "pass" : "fail";
        System.out.println(String.format("%s : actual = %s : expected = %s : input = %s", pass, solution, expected, Arrays.toString(input)));
    }

}
