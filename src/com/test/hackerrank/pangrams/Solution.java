package com.test.hackerrank.pangrams;

import java.io.IOException;
import java.util.ArrayList;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        ArrayList<Integer> asciLetters = new ArrayList<>();
        for (int i = 97; i <= 122; i++) asciLetters.add(i);
        System.out.println(asciLetters);

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i)).toLowerCase();
            char c = ch.charAt(0);
            asciLetters.remove(Integer.valueOf((int)c));
        }
        System.out.println(asciLetters);

        String response = asciLetters.isEmpty() ? "pangram" : "not pangram";
        System.out.println(response);
        return response;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Result.pangrams("The quick brown fox jumps over the lazy do");

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = Result.pangrams(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
