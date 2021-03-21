package com.test.functions;

import java.util.function.Consumer;

public class TestConsumer implements Consumer<TestConsumer.TestObject> {

    @Override
    public void accept(TestObject testObject) {
        testObject.setField(testObject.getField().toUpperCase());
    }

    public static class TestObject {
        private String field;

        public TestObject(String field) {
            this.field = field;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        @Override
        public String toString() {
            return "TestObject{" +
                    "field='" + field + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        // named
        TestConsumer testConsumer = new TestConsumer();
        TestObject testObject = new TestObject("hello");
        System.out.println(testObject);
        testConsumer.accept(testObject);
        System.out.println(testObject);

        // anonymous
        TestObject object = new TestObject("hello");
        Consumer<TestConsumer.TestObject> consumer = test -> test.setField("hey " + test.getField());
        System.out.println(object);
        consumer.accept(object);
        System.out.println(object);
    }

}
