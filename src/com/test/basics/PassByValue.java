package com.test.basics;

public class PassByValue { // Java is always pass by value (value being the reference pointing to the object address)

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        changePrimitive(x);
        System.out.println(x);

        System.out.println("~~~~~~~~~~");
        Test test = new Test();
        test.setField(5);
        System.out.println(test.getField());
        changeObject(test);
        System.out.println(test.getField());
    }

    public static void changePrimitive(int x) {
        x = 10;
        System.out.println(x);
    }

    public static void changeObject(Test test) {
        test.setField(10);
        System.out.println(test.getField());
    }

    public static class Test {
        private int field;

        public int getField() {
            return field;
        }

        public void setField(int field) {
            this.field = field;
        }
    }

}
