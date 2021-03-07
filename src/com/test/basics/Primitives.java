package com.test.basics;

public class Primitives {

    private int intField;
    private long longField;
    private double doubleField;
    private float floatField;
    private boolean booleanField;
    private byte byteField;

    public static void main(String[] args) {
        System.out.println(String.format("int [%s] [%s]", Integer.MIN_VALUE, Integer.MAX_VALUE)); //  10 digits
        System.out.println(String.format("long [%s] [%s]", Long.MIN_VALUE, Long.MAX_VALUE));
        System.out.println(String.format("double [%s] [%s]", Double.MIN_VALUE, Double.MAX_VALUE));
        System.out.println(String.format("float [%s] [%s]", Float.MIN_VALUE, Float.MAX_VALUE));
    }

}
