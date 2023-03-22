package com.test.hackerrank.texteditor;

import static java.awt.SystemColor.text;

public class Solution {

    public static void main(String[] args) {

        State state = new State("hello");

        append(state, "world");
        System.out.println(state);

        delete(state, 2);
        System.out.println(state);

        print(state, 1);
        print(state, 5);

        undo(state);
        System.out.println(state);
    }

    private static void append(State state, String text) {
        state.setCurrent(state.getCurrent() + text);
    }

    private static void delete(State state, int lastCount) {
        state.setCurrent(state.getCurrent().substring(0, state.getCurrent().length()-lastCount));
    }

    private static void print(State state, int position) {
        StringBuilder sb = new StringBuilder(state.getCurrent());
        System.out.println(sb.charAt(position-1));
    }

    private static void undo(State state) {
        state.setCurrent(state.getPrevious());
    }

    private static class State {

        private String current;
        private String previous;

        public State(String current) {
            this.current = current;
            this.previous = null;
        }

        public String getCurrent() {
            return current;
        }

        public void setCurrent(String current) {
            this.previous = this.current;
            this.current = current;
        }

        public String getPrevious() {
            return previous;
        }

        public void setPrevious(String previous) {
            this.previous = previous;
        }

        @Override
        public String toString() {
            return "State{" +
                    "previous='" + previous + '\'' +
                    ", current='" + current + '\'' +
                    '}';
        }
    }

}
