package com.test.problems;

import java.util.*;

public class Test {

    public static void main(String[] args) {
//        reverseString();
//        swap();
//        countWordsInString();
//        iterateHashmap();
//        isPrimeTest();
//        isPalindrome();
//        fibonnaci();
//        findDuplicateCharactersInString();
//        findSecondHighestNumberInArray();
//        isArmstrongNumber();
        isAnagram();
    }

    public static void reverseString() {
        String str = "Tony Stark";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        StringBuilder reverse = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
//            System.out.println(chars[i]);
            reverse.append(chars[i]);
        }
        System.out.println(reverse.toString());
    }

    public static void swap() {
        int x = 2;
        int y = 3;
        int z = 0;
        System.out.println(String.format("x=%s : y=%s", x, y));
        z = x;
        x = y;
        y = z;
        System.out.println(String.format("x=%s : y=%s", x, y));
    }

    public static void countWordsInString() {
        String str = "The quick brown fox jumps over the lazy dog";
        String[] split = str.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println(split.length);
    }

    public static void iterateHashmap() {
        Map<String, String> map = new HashMap<>();
        map.put("tony", "stark");
        map.put("peter", "parker");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry entry :  entries) {
            System.out.println(entry);
        }
    }

    public static void isPrimeTest() {
        isPrime(7);
//        for (int i = 2; i<=100; i++) {
//            isPrime(i);
//        }
    }

    public static void isPrime(int num) {
        boolean isPrime = false;
        int divisor = 2;
        for (int i = 2; i <= 9; i++) {
            int remainder = num % divisor;
            System.out.println(String.format("divisor: %s, remainder = %s", divisor, remainder));
            if (remainder == 0 && divisor != num) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
            divisor++;
        }
        System.out.println(String.format("%s : %s", num, isPrime));
    }

    public static void isPalindrome() {
        String str = "radar";
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        System.out.println(str);
        System.out.println(reverse);
        System.out.println(str.equals(reverse));
    }

    public static void fibonnaci() {
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int max = 1000;
        int next = 0;
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        for (int i = 1; next<max; i++) {
            int lastIndex = i;
            int secondLastIndex = (i-1 > 0) ? i-1 : 0;
            System.out.println(String.format("%s : %s", lastIndex, secondLastIndex));
            next = sequence.get(lastIndex) + sequence.get(secondLastIndex);
            System.out.println("next: " + next);
            if (next < max) {
                sequence.add(next);
            }
        }
        System.out.println(Arrays.toString(sequence.toArray()));
    }

    public static void findDuplicateCharactersInString() {
        String str = "hellooe";
        Set<Character> charSet = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        str.codePoints().forEach(ch -> {
            char chStr = (char) ch;
            if (!charSet.contains(chStr)) {
                charSet.add(chStr);
            } else {
                duplicates.add(chStr);
            }
        });
        System.out.println(duplicates);
    }

    public static void findSecondHighestNumberInArray() {
        int[] numbers = {1, 7, 56, 34, 987, 23, 38, 20, 3, 1029};

        // sort numbers in ascending
        int[] ints = Arrays.stream(numbers).sorted().toArray();

        // find by index size-2
        System.out.println(Arrays.toString(ints));
        System.out.println(ints[ints.length-2]);
    }

    public static void isArmstrongNumber() {
        int num = 371;
        char[] chars = String.valueOf(num).toCharArray();
        System.out.println(Arrays.toString(chars));
        int sum = 0;
        for(int i = 0; i < chars.length; i++) {
            int c = Integer.valueOf(String.valueOf(chars[i]));
            int cube =  c * c * c;
            System.out.println(cube);
            sum = sum + cube;
        }
        System.out.println(String.format("%s = %s : %s", num, sum, sum == num));
    }

    public static void isAnagram() {
        String first = "fiber";
        String second = "brief";

        char[] chars1 = first.toCharArray();
        char[] chars2 = second.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        System.out.println(chars1);
        System.out.println(chars2);
        System.out.println(Arrays.equals(chars1, chars2));
    }

}
