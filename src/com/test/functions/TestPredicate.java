package com.test.functions;

import java.util.Optional;
import java.util.function.Predicate;

public class TestPredicate implements Predicate<TestPredicate.TestObject> {

    @Override
    public boolean test(TestObject testObject) {
        return Optional.ofNullable(testObject.getField()).isPresent();
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
        TestPredicate testPredicate = new TestPredicate();
        System.out.println(testPredicate.test(new TestObject(null)));
        System.out.println(testPredicate.test(new TestObject("hello")));

        Predicate<TestPredicate.TestObject> predicate = testObject -> Optional.ofNullable(testObject.getField()).isEmpty();
        System.out.println(predicate.test(new TestObject(null)));
        System.out.println(predicate.test(new TestObject("hello")));
    }

}
