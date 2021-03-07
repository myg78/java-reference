package com.test.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Unpaired {

    public static void main(String[] args) {

//        int[] array = {9, 3, 9, 3, 9, 7, 9};
//        int[] array = {9, 3, 9, 3, 99, 7, 9};
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 5};

        Unpaired solution = new Unpaired();
        solution.solution(array);
    }

    public int solution(int[] array) {

        Map<Integer, Integer> numCount = new HashMap<>();
        Arrays.stream(array).forEach(num -> {
            Optional<Integer> match = Optional.ofNullable(numCount.get(num));
            int count = match.map(integer -> integer + 1).orElse(1);
            numCount.put(num, count);
//            System.out.println(String.format("num: %s - %s", num, numCount.get(num)));
        });

        // log count per num
        numCount.entrySet().stream().forEach(entry -> {
            System.out.println(String.format("key: %s - %s", entry.getKey(), entry.getValue()));
        });

        Optional<Integer> integer = numCount.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .findFirst()
                .map(Map.Entry::getKey);
        System.out.println("answer: " + integer.get());

        return integer.orElse(0);
    }

}
