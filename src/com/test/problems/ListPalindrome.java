package com.test.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListPalindrome {

    public static void main(String[] args) {
        isPalindrome(Arrays.asList("x", "a", "m", "a", "x"));
        isPalindrome(Arrays.asList("a", "b", "c"));
        isPalindrome(Arrays.asList("d", "o", "g"));
        isPalindrome(Arrays.asList("d", "o", "g", "o", "d"));
        isPalindrome(Arrays.asList("dog", "cat", "fish"));
        isPalindrome(Arrays.asList("dog", "cat", "dog"));
        isPalindrome(Arrays.asList("king", "are", "you", "glad", "you", "are", "king"));
        isPalindrome(Arrays.asList("borrow", "or", "rob"));
        isPalindrome(Arrays.asList("a", "nut", "for", "a", "jar", "of", "tuna"));
        isPalindrome(Arrays.asList("nurses", "run"));
    }

    // concat list to string then compare reversed list string
    public static boolean isPalindrome(List<String> list) {
        String listStr = String.join("", list);
        Collections.reverse(list);
        String reverseStr = list.stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining(""));
        boolean isPalindrome = listStr.equals(String.join("", reverseStr));
        System.out.println(String.format("%s - %s = %s", listStr, reverseStr, isPalindrome));
        return isPalindrome;
    }

    /* public static boolean isPalindrome(List<String> list) { //
        List<String> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        boolean isPalindrome = list.equals(reverse);
        System.out.println(String.format("%s - %s = %s", list, reverse, isPalindrome));
        return isPalindrome;
    }*/

}
