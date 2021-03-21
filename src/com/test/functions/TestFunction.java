package com.test.functions;

import java.util.function.Function;

public class TestFunction implements Function<String, Object> {

    @Override
    public Object apply(String str) {
        return "hello " + str;
    }

    public static void main(String[] args) {
        // named
        TestFunction testFunction = new TestFunction();
        System.out.println(testFunction.apply("world"));

        // anonymous function
        Function<String, Object> function = str -> "hi " + str;
        System.out.println(function.apply("foo"));
    }

}
