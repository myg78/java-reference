package com.test.problems;

import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        String str = "[(())]";
        int solution = brackets.solution(str);
        System.out.println("solution: " + solution);
    }

    public int solution(String str) {
//        Deque<Character> stack = new ArrayDeque<>();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
//            System.out.println("char: " + chr);
            switch (chr) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return 0;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return 0;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') {
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
}
