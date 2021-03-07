package com.test.basics;

import java.util.List;

public class StringUtil {

    public static void main(String[] args) {
//        staticMethods();
        builderMethods();
    }

    public static void staticMethods() {
        String text = "world";
        System.out.println(String.format("Hello %s", text));

        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(2.0));

        System.out.println(String.join("|", List.of("Peter", "Tony", "Steve")));

        char[] chars = text.toCharArray();
        System.out.println(String.copyValueOf(chars));
        System.out.println(String.copyValueOf(chars, 1, 2));
    }

    public static void methods() {
        String text = "hello";
    }

    public static void builderMethods() {
        StringBuilder sb = new StringBuilder();

        // format
        sb.append("hello").append("world");
        System.out.println(sb.toString());

        // reverse
        System.out.println(sb.reverse());
    }

}
