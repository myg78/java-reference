package com.test.basics;

import java.util.Arrays;
import java.util.List;

public class StringUtil {

    public static void main(String[] args) {
//        staticMethods();
        builderMethods();
    }

    public static void staticMethods() {
        // format
        String text = "world";
        System.out.println(String.format("Hello %s", text));

        // valueOf
        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(2.0));

        // copyValueOf
        System.out.println(String.copyValueOf("test".toCharArray()));

        // join
        System.out.println(String.join("|", List.of("Peter", "Tony", "Steve")));

        // toCharArray
        char[] chars = text.toCharArray();
        System.out.println(chars);
        System.out.println(String.copyValueOf(chars));
        System.out.println(String.copyValueOf(chars, 1, 2));
    }

    public static void methods() {
        String text = "hello";
    }

    public static void builderMethods() {
        StringBuilder sb = new StringBuilder();

        // append
        sb.append("append");

        // format
        sb.append("hello").append("world");
        System.out.println(sb.toString());

        // indexOf
        System.out.println(sb.indexOf("hello"));

        // replace
        System.out.println(sb.replace(0, 6, "test"));

        // charAt
        System.out.println(sb.charAt(2));

        // deleteCharAt
        System.out.println(sb.deleteCharAt(0));

        // delete
        System.out.println(sb.delete(0, 3));

        // insert
        System.out.println(sb.insert(5, "there"));

        // substring
        System.out.println(sb.substring(sb.length()-5));

        // reverse
        System.out.println(sb.reverse());

        // chars stream
        System.out.println(Arrays.toString(sb.chars().toArray()));

        // length
        System.out.println(sb.length());
    }

}
