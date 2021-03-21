package com.test.patterns.builder;

public class TestBuilder {

    public static void main(String[] args) {

        Request request = Request.Builder.standard()
                .withHeader("test header")
                .withBody("test body")
                .withFooter("test footer")
                .withNotes("test notes")
                .build();
        System.out.println(request);

        Request request2 = Request.Builder.standard()
                .withBody("body")
                .withFooter("footer")
                .build();
        System.out.println(request2);
    }

}
