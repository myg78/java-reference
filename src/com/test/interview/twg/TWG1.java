package com.test.interview.twg;

public class TWG1 {

    public String solution(String message, int limit) {

        // System.out.println(String.format("message: %s : %s", message, limit));
        if (message == null) return "";

        String[] words = getWords(message.trim());
        String currentMessage = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            sb.append(" ");
            // System.out.println(String.format("i: %s : %s : %s", words[i], currentMessage, getLength(currentMessage)));
            if (getLength(sb.toString().trim()) > limit) {
                // System.out.println("break");
                break;
            }
            currentMessage = sb.toString().trim();
        }

        return currentMessage;
    }

    public String[] getWords(String message) {
        String[] words = message.split(" ");
        // System.out.println("words: " + Arrays.toString(words));
        return words;
    }

    public static int getLength(String text) {
        if (text == null) return 0;
        return text.length();
    }

    public static void main(String[] args) {
        // Default tests
         TWG1.testEqual("Codility We", "Codility We test coders", 14);
         TWG1.testEqual("Why not", "Why not", 100);
         TWG1.testEqual("The quick brown fox jumps over the lazy", "The quick brown fox jumps over the lazy dog", 39);

        // Other tests
        TWG1.testEqual("The quick", "The quick brown fox jumps over the lazy dog", 9); // limit ends with no space
        TWG1.testEqual("The quick", "The quick brown fox jumps over the lazy dog", 10); // limit ends with space
        TWG1.testEqual("The quick", "The quick brown fox jumps over the lazy dog", 11); // limit ends with next word
        TWG1.testEqual("The quick", "The quick brown fox jumps over the lazy dog", 13); // limit ends with next word
        TWG1.testEqual("The quick brown fox jumps over the lazy dog", "The quick brown fox jumps over the lazy dog", 43); // limit same as text
        TWG1.testEqual("The quick brown fox jumps over the lazy dog", "The quick brown fox jumps over the lazy dog ", 43); // limit same as text with extra space

        // Some edge cases
        TWG1.testEqual("", "", 10);
        TWG1.testEqual("", null, 10);
        TWG1.testEqual("test", "test", 10); // one word below limit
        TWG1.testEqual("test", "test", 4); // one word at limit
        TWG1.testEqual("", "test", 3); // one word above limit
        TWG1.testEqual("", "supercalifragilisticexpialidocious", 10); // one word above limit
        TWG1.testEqual("hello  world", "hello  world", 50); // multiple spaces in between (not supported)
    }

    public static void testEqual(String expected, String message, int limit) {
        TWG1 twg1 = new TWG1();
        String solution = twg1.solution(message, limit);
        boolean result = solution.equals(expected);
        String pass = result ? "pass" : "fail";
        System.out.println(String.format("%s : actual = %s : expected = %s : input = %s %s", pass, solution, expected, message, limit));
    }

}
