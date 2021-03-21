package com.test.functions;

import java.util.function.Supplier;

public class TestSupplier implements Supplier<String> {

    @Override
    public String get() {
        return "world";
    }

    public static void main(String[] args) {
        TestSupplier testSupplier = new TestSupplier();
        System.out.println(testSupplier.get());

        Supplier<String> supplier = () -> "there";
        System.out.println(supplier.get());
    }
}
