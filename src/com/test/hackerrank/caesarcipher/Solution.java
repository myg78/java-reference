package com.test.hackerrank.caesarcipher;

import java.io.IOException;
import java.util.HashMap;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String cipher = rotateLeft(alphabet, k);

        char[] keys = alphabet.toCharArray();
        char[] maps = cipher.toCharArray();

        HashMap<String, String> cipherMap = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            cipherMap.put(String.valueOf(keys[i]), String.valueOf(maps[i]));
            cipherMap.put(String.valueOf(keys[i]).toUpperCase(), String.valueOf(maps[i]).toUpperCase());
        }
        System.out.println(cipherMap);

        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            String current = String.valueOf(chars[i]);
            sb.append(cipherMap.getOrDefault(current, current));
        }
        System.out.println(sb);
        return sb.toString();
    }

    private static String rotateLeft(String text, int ct) {
        int count = ct % 26;
        String left = text.substring(0, count);
        String right = text.substring(count);
        return right + left;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Result.caesarCipher("middle-Outz", 2);
        Result.caesarCipher("www.abc.xy", 87);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String s = bufferedReader.readLine();
//
//        int k = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String result = Result.caesarCipher(s, k);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
