package com.test.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class Nesting {

    public int solution(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            switch (chr) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return 0;
                    }
                    break;
                default:
                    stack.push(chr);
                    break;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Nesting.test(1, "(()(())())");
        Nesting.test(1, "()");
        Nesting.test(1, "()()");
        Nesting.test(0, "()(");
        Nesting.test(0, "(");
        Nesting.test(0, "(()");
        Nesting.test(0, "())");
    }

    public static void test(int expected, String input) {
        Nesting nesting = new Nesting();
        int solution = nesting.solution(input);
        boolean result = solution == expected;
        String pass = result ? "pass" : "fail";
        System.out.println(String.format("%s : actual = %s : expected = %s : input = %s", pass, solution, expected, input));
    }

}
