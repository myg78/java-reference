package com.test.interview.twg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://app.codility.com/c/feedback/Z4KSVD-S8W/

public class TWG3 {

    public int solution(String startTime, String endTime) {
        int hour = 0;
        int minute = 0;
        int second = 0;
//        String clockDisplay = toDisplay(hour, minute, second);

        int[] startParts = toIntArray(startTime.split(":"));
        int[] endParts = toIntArray(endTime.split(":"));
//        System.out.println("end: " + Arrays.toString(endParts));
        int startTimeSeconds = computeSeconds(startTime);
        int endtimeSeconds = computeSeconds(endTime);
        System.out.println(String.format("start: %s - %s", Arrays.toString(startParts), startTimeSeconds));
        System.out.println(String.format("end: %s - %s", Arrays.toString(endParts), endtimeSeconds));

        StringBuilder sb = new StringBuilder();
        List<String> times = new ArrayList<>();

        // this is a brute force attempt (not ideal) to iterate over all clock ticks between 2 dates
        // then do string-based parsing to determine unique digits at every tick
        // consider other alternative /  more efficient time-based or math-based algorithms
        for (int hh = startParts[0]; hh <= endParts[0]; hh++) {
            // System.out.println(String.format("hh: %s - %s", startParts[0], endParts[0]));
            for (int mm = Math.min(0, startParts[1]); mm <= Math.max(endParts[1], 59) ; mm++) {
                for (int ss = Math.min(0, startParts[2]); ss <= Math.max(endParts[2], 59); ss++) {
                    String display = toDisplay(hh, mm, ss);
                    int currentSeconds = computeSeconds(display);
                    if(currentSeconds < startTimeSeconds) continue;
                    System.out.println(String.format("display: %s - %s - %s", display, countDistinctNumbers(display), currentSeconds));
                    if(countDistinctNumbers(display) == 2) {
                        times.add(display);
                    }
                    if(currentSeconds > endtimeSeconds) break; // exit past seconds
                }
                if(computeSeconds(toDisplay(hh, mm, endParts[2])) > endtimeSeconds) break; // exit past minutes
            }
        }
        System.out.println("match: " + Arrays.toString(times.toArray()));

        return times.size();
    }

    public String toDigitString(int digit) {
        return String.format("%02d", digit);
    }

    public String toDisplay(int hour, int minute, int second){
        return String.format("%s:%s:%s", toDigitString(hour), toDigitString(minute), toDigitString(second));
    }

    public static long countDistinctNumbers(String display) {
        return countDistinctCharacters(display.replace(":",""));
    }

    public static long countDistinctCharacters(String input) {
        return input.chars().distinct().count();
    }

    public int computeSeconds(String display){
        int[] parts = toIntArray(display.split(":"));
        return (parts[0] * 3600) + (parts[1] * 60) + parts[2];
    }

    public int[] toIntArray(String[] parts){
        int[] numbers = new int[parts.length];
        for(int i = 0;i < parts.length;i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        return numbers;
    }

    public static void main(String[] args) {
        TWG3.testEqual(1, "15:15:00", "15:15:12");
        TWG3.testEqual(3, "22:22:21", "22:22:23");
//        TWG3.testEqual(3, "22:22:21", "22:22:23");
    }

    public static void testEqual(int expected, String startTime, String endTime) {
        TWG3 twg3 = new TWG3();
        int solution = twg3.solution(startTime, endTime);
        boolean result = solution == expected;
        String pass = result ? "pass" : "fail";
        System.out.println(String.format("%s : actual = %s : expected = %s : input = %s %s", pass, solution, expected, startTime, endTime));
    }

}
