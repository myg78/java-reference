package com.test.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
         // list
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("there");
        list.add("world");
        list.add("foo");
        list.add("bar");

        // conversion
        System.out.println(list);
        System.out.println(Arrays.toString(list.toArray()));

        // sort
        Collections.sort(list);
        System.out.println(list);

        // sublist
        System.out.println(list.subList(1,3));
    }

}
