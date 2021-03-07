package com.test.problems;

import java.util.HashSet;
import java.util.Set;

public class CountDiv {

    public static void main(String[] args) {
        CountDiv countDiv = new CountDiv();
//        System.out.println("solution: " + countDiv.solution(6, 11, 2));
//        System.out.println("solution: " + countDiv.solution(1, 2000000000, 1));
//        System.out.println("solution: " + countDiv.solution2(6, 11, 2));
        System.out.println("solution: " + countDiv.solution2(1, 2000000000, 1));
    }

    public int solution(int low, int high, int divisor) {
        if (divisor == 0) return 0;
        Set<Integer> divisibles = new HashSet<>();
        for (int i = low; i <= high ; i++) {
            boolean current = i % divisor == 0;
            if (current) {
                divisibles.add(i);
            }
        }
        return divisibles.size();
    }

    public int solution2(int low, int high, int divisor) {
        int inclusive = (low%divisor==0?1:0);
        return high/divisor - low/divisor + inclusive;
    }

}
