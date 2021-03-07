package com.test.problems;

import java.util.Arrays;

public class MaxProfit {

    public int solution0(int[] dailyPrices) {
        int currentMaxProfit = 0;
        int counter = 0;
        for (int i = 0; i < dailyPrices.length; i++) {
            System.out.println("~~~~~~~~~~~~~");
            System.out.println("i = " + i + " " + dailyPrices[i]);
            for (int j = i+1; j < dailyPrices.length; j++) {
                int currentDayPrice = dailyPrices[i];
                int nextPrice = dailyPrices[j];
                if (nextPrice < currentDayPrice) continue; // skip losses
                int diff = nextPrice - currentDayPrice;
                System.out.println(String.format("j: %s : %s - %s = %s", j, dailyPrices[j], dailyPrices[i], diff));
                if (diff > currentMaxProfit) currentMaxProfit = diff;
                System.out.println("currentMaxProfit: " + currentMaxProfit);
                counter++;
            }
        }
        System.out.println("result: " + currentMaxProfit);
        System.out.println("counter: " + counter);
        return currentMaxProfit;
    }

    public int solution(int[] dailyPrices) {
        if(dailyPrices.length == 1 || dailyPrices.length == 0) return 0;

        int currentMaxProfit = 0;
        int dayProfit = 0;
        int currentMinPrice = dailyPrices[0];

        for(int i = 1; i < dailyPrices.length; i++){
            System.out.println("~~~~~~~~~~~~~");
            int dayPrice = dailyPrices[i];
            System.out.println("dayPrice: " + dayPrice);
            dayProfit = Math.max(0, dayPrice - currentMinPrice);
            currentMinPrice = Math.min(dayPrice, currentMinPrice);
            currentMaxProfit = Math.max(dayProfit, currentMaxProfit);
            System.out.println("dayProfit: " + dayProfit);
            System.out.println("currentMinPrice: " + currentMinPrice);
            System.out.println("currentMaxProfit: " + currentMaxProfit);
        }

        return currentMaxProfit;
    }

    public static void main(String[] args) {
        MaxProfit.test(356, new int[]{23171, 21011, 21123, 21366, 21013, 21367});
//        MaxProfit.test(5, new int[]{1, 2, 3, 4, 5, 6}); // maximum number of iterations
//        MaxProfit.test(5, new int[]{101, 106, 103, 104, 105, 102}); // maximum number of iterations
    }


    public static void test(int expected, int[] input) {
        MaxProfit maxProfit = new MaxProfit();
        int solution = maxProfit.solution(input);
        boolean result = solution == expected;
        String pass = result ? "pass" : "fail";
        System.out.println(String.format("%s : actual = %s : expected = %s : input = %s", pass, solution, expected, Arrays.toString(input)));
    }
}
