package com.test.hackerrank.gridchallenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here

        ArrayList<String> sortedGrid = new ArrayList<>();
        grid.forEach(x -> sortedGrid.add(rearrange(x)));

        String s = sortedGrid.stream().reduce((a, b) -> a + b).orElse("");
        char[] chars = s.toCharArray();
        // System.out.println(chars);

        ArrayList<Integer> ints = new ArrayList<>();
        for (char aChar : chars) {
            int charInt = (int) aChar;
            // System.out.println(aChar + " : " + charInt);
            ints.add(charInt);
        }

        ArrayList<Integer> sortedInts = new ArrayList<>(ints);
        Collections.sort(sortedInts);

        System.out.println(ints);
        System.out.println(sortedInts);
        System.out.println(ints.equals(sortedInts));

        return ints.equals(sortedInts) ? "YES" : "NO";
    }

    private static String rearrange(String text) {
        char[] chars = text.toCharArray();
        ArrayList<Integer> ints = new ArrayList<>();
        for (char aChar : chars) {
            int charInt = (int) aChar;
            ints.add(charInt);
        }
        Collections.sort(ints);
        StringBuilder sb = new StringBuilder();
        ints.forEach(c -> sb.append((char)c.intValue()));
        return sb.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

//        Result.gridChallenge(List.of("zab","def","hij"));
        Result.gridChallenge(List.of("kc","iu"));
//        Result.gridChallenge(List.of("uxf","vof", "hmp"));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, t).forEach(tItr -> {
//            try {
//                int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
//                            try {
//                                return bufferedReader.readLine();
//                            } catch (IOException ex) {
//                                throw new RuntimeException(ex);
//                            }
//                        })
//                        .collect(toList());
//
//                String result = Result.gridChallenge(grid);
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
