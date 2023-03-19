package com.test.interview.cfa;

import java.util.Arrays;
import java.util.List;

/**
 * Copy this file to your IDE of choice. Rename the package and class files if necessary.
 */
public class Test1 {

    /**
     * This is a sample coding problem for implementing Objects and Streams via Java 8.
     * <p>
     * This provides the sample test data and classes for a rock band having a list of band members,
     * as well as built-in unit tests to check the correct answers.
     * <p>
     * The objective is to write the code implementation for these 2 methods below such that the main method runs
     * and completes successfully with no errors.
     * <p>
     * {@link RockBand#getFirstNamesOfVocalists()}}
     * {@link RockBand#getFullNamesOfMaleMembersSortedByFirstName()}
     */
    public static void main(String[] args) {

        // This is a sample unit test for checking your code with the correct answers based on the sample data below.

        // Given a sample rock band with 5 band members - each having a first name, last name, role and gender.
        RockBand band = new RockBand("Java Rocks", "Rock and roll");
        band.setMembers(Arrays.asList(
                new BandMember("Freddie", "Mercury", "vocalist", "male"),
                new BandMember("Amy", "Lee", "vocalist", "female"),
                new BandMember("George", "Harrison", "rhythm guitar", "male"),
                new BandMember("Slash", "Hudson", "lead guitar", "male"),
                new BandMember("Flea", "Balzary", "bass guitar", "male"),
                new BandMember("John", "Petrucci", "drums", "male")
        ));

        // Problem # 1
        // When finding the first names of vocalists
        List<String> answer1 = band.getFirstNamesOfVocalists(); // provide code for this method below

        // Then it should return the correct list below
        List<String> correctFirstNames = Arrays.asList("Freddie", "Amy");
        testOutput1(correctFirstNames, answer1);

        // Problem # 2
        // When finding the full names of male members sorted by first name
        List<String> answer2 = band.getFullNamesOfMaleMembersSortedByFirstName(); // provide code for this method below

        // Then it should return the correct list below
        List<String> correctFullNames = Arrays.asList("Flea Balzary", "Freddie Mercury", "George Harrison", "John Petrucci", "Slash Hudson");
        testOutput2(correctFullNames, answer2);

        System.out.println("SUCCESS");
    }

    private static class RockBand {

        private String name;
        private String genre;
        private List<BandMember> members;

        public RockBand(String name, String genre) {
            this.name = name;
            this.genre = genre;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public List<BandMember> getMembers() {
            return members;
        }

        public void setMembers(List<BandMember> members) {
            this.members = members;
        }

        /**
         * TODO Implement this method to return the first names of vocalists. Java 8 streams preferred.
         */
        public List<String> getFirstNamesOfVocalists() {
            throw new UnsupportedOperationException("Please provide the code for this method");
        }

        /**
         * TODO Implement this method to return the full names (firstName lastName) of male members sorted by first name. Java 8 streams preferred.
         */
        public List<String> getFullNamesOfMaleMembersSortedByFirstName() {
            throw new UnsupportedOperationException("Please provide the code for this method");
        }

    }

    private static class BandMember {

        private String firstName;
        private String lastName;
        private String role;
        private String gender;

        public BandMember(String firstName, String lastName, String role, String gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.role = role;
            this.gender = gender;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

    public static void testOutput1(List<String> expected, List<String> actual) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("First names of vocalists:");
        System.out.println("Expected: \t" + expected);
        System.out.println("Actual: \t" + actual);
        assertEquals(expected, actual);
    }

    public static void testOutput2(List<String> expected, List<String> actual) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Full names of male members sorted by first name:");
        System.out.println("Expected: \t" + expected);
        System.out.println("Actual: \t" + actual);
        assertEquals(expected, actual);
    }

    private static void assertEquals(List<String> expected, List<String> actual) {
        if (!expected.equals(actual)) throw new RuntimeException("Incorrect answer");
        System.out.println("Your answer is correct");
    }

}
