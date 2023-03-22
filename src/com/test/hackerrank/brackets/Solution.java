package com.test.hackerrank.brackets;

import java.io.IOException;
import java.util.Stack;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here

        Stack<Character> stack = new Stack<>();
        boolean balanced = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        balanced = false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        balanced = false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        balanced = false;
                    }
                    break;
                default:
                    stack.push(ch);
            }
        }
        balanced = stack.isEmpty() && balanced;
        System.out.println("final: " + stack);
        String response = balanced ? "YES" : "NO";
        System.out.println(response);
        return response;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Result.isBalanced("{[()]}");

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, t).forEach(tItr -> {
//            try {
//                String s = bufferedReader.readLine();
//
//                String result = Result.isBalanced(s);
//
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
