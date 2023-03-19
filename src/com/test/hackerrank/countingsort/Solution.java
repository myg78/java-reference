package com.test.hackerrank.countingsort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {

        System.out.println(arr);

        int min = arr.stream().mapToInt(Integer::intValue).min().getAsInt();
        int max = arr.stream().mapToInt(Integer::intValue).max().getAsInt();

        System.out.println(min);
        System.out.println(max);

        ArrayList<Integer> counter = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            counter.add(0);
        }
        System.out.println(counter);

        arr.forEach(e -> {
            System.out.println(e);
            Integer currVal = counter.get(e);
            counter.set(e, currVal + 1);
        });
        System.out.println(counter);

        ArrayList<Integer> sorted = new ArrayList<>();
        for (int i = 0; i < counter.size(); i++) {
            Integer iCount = counter.get(i);
            for (int j = 0; j < iCount; j++) {
                sorted.add(i);
            }
        }
        System.out.println(sorted);

        return counter;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

//        Result.countingSort(List.of(1,1,3,2,1));
        Result.countingSort(List.of(63, 54, 17, 78, 43, 70, 32, 97, 16, 94, 74, 18, 60, 61, 35, 83, 13, 56, 75, 52, 70, 12, 24, 37, 17, 0, 16, 64, 34, 81, 82, 24, 69, 2, 30, 61, 83, 37, 97, 16, 70, 53, 0, 61, 12, 17, 97, 67, 33, 30, 49, 70, 11, 40, 67, 94, 84, 60, 35, 58, 19, 81, 16, 14, 68, 46, 42, 81, 75, 87, 13, 84, 33, 34, 14, 96, 7, 59, 17, 98, 79, 47, 71, 75, 8, 27, 73, 66, 64, 12, 29, 35, 80, 78, 80, 6, 5, 24, 49, 82));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> result = Result.countingSort(arr);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
