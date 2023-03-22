package com.test.reference;

public class CharacterTest {

    public static void main(String[] args) {

        // single quote character literal
        char ch = 'a';
        System.out.println(ch);

        // get ascii
        System.out.println((int) ch);

        // single quote character number
        ch = '1';
        System.out.println(ch);
        System.out.println((int) ch);

        // get char numeric value
        System.out.println(Character.getNumericValue(ch));

        // char array
        String text = "hello";
        System.out.println(text.toCharArray());

        // character index
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

    }

}
