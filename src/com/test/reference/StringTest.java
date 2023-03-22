package com.test.reference;

import java.nio.charset.Charset;
import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {

        String text = "abcdeAZ";

        // chars
        System.out.println(text.toCharArray());
        System.out.println(text.charAt(0));
        System.out.println((int)text.charAt(0));
        System.out.println(text.codePointAt(0));

        // portion
        System.out.println(text.substring(1));
        System.out.println(text.substring(0,3));

        // bytes
        byte[] bytes = text.getBytes(Charset.defaultCharset());
        System.out.println(Arrays.toString(bytes));

        // content manipulation
        System.out.println(text.repeat(2));
        System.out.println(text.concat("world"));
        System.out.println(text.replace("AZ", "world"));
        System.out.println(Arrays.toString(text.split("e")));

        // string builder
        StringBuilder sb = new StringBuilder(text);

        // reverse
        System.out.println(sb.reverse());

        // delete
        sb = new StringBuilder(text);
        System.out.println(sb.delete(0, 3));
        sb = new StringBuilder(text);
        System.out.println(sb.deleteCharAt(0));
    }

}
