package com.test.basics;

import java.util.List;
import java.util.Set;

public class CollectionsUtil {

    public static void main(String[] args) {
        staticMethods();
    }

    public static void staticMethods() {
        // List
        var immutableList = List.of("test1", "test2", "test3", "test3");
        // immutableList.add("test4"); // UnsupportedOperationException
        System.out.println(immutableList);

        List<String> list = List.copyOf(Set.of("test1", "test2", "test3"));
        System.out.println(list);

        // Set
        Set<String> set = Set.copyOf(immutableList);
        System.out.println(set);

        // Collections


    }

}
