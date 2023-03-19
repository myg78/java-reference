package com.test.interview.cfa;

/**
 * Copy this file to your IDE of choice. Rename the package and class files if necessary.
 */
public class Test2 {

    /**
     * This is a sample coding problem for implementing recursion where you have a hierarchy of items (parent-child relationship).
     * <p>
     * This provides the sample test data and classes as well as built-in unit tests to check the correct answers.
     * <p>
     * The objective is to write the code implementation for this method below such that the main method runs
     * and completes successfully with no errors.
     * <p>
     * {@link MenuItem#getDepth()}}
     */
    public static void main(String[] args) {

        // This is a sample unit test for checking your code with the correct answers based on the sample data below.

        // Given a sample hierarchy of menu items where you have food items grouped/nested under other food categories or items
        // -> Breakfast Submenu
        // ----> Biscuit Group
        // -------> Bacon Biscuit
        // -------> Ham Biscuit
        MenuItem breakfastSubmenu = new MenuItem("Breakfast Submenu");
        MenuItem biscuitGroup = new MenuItem("Biscuit Group", breakfastSubmenu);
        MenuItem baconBiscuit = new MenuItem("Bacon Biscuit", biscuitGroup);
        MenuItem hamBiscuit = new MenuItem("Ham Biscuit", biscuitGroup);

        // When retrieving depth for items at first level, then it should return 0
        assertEqualsFor(0, breakfastSubmenu.getDepth(), breakfastSubmenu.getName());

        // When retrieving depth for items at second level, then it should return 1
        assertEqualsFor(1, biscuitGroup.getDepth(), biscuitGroup.getName());

        // When retrieving depth for items at third level, then it should return 2
        assertEqualsFor(2, baconBiscuit.getDepth(), baconBiscuit.getName());
        assertEqualsFor(2, hamBiscuit.getDepth(), hamBiscuit.getName());

        System.out.println("SUCCESS");
    }

    private static class MenuItem {

        private String name;
        private MenuItem parent;

        public MenuItem(String name) {
            this.name = name;
        }

        public MenuItem(String name, MenuItem parent) {
            this.name = name;
            this.parent = parent;
        }

        public String getName() {
            return name;
        }

        /**
         * TODO Implement this method to get the item depth such that the top-level is 0
         */
        public int getDepth() {
            throw new UnsupportedOperationException("Please provide the code for this method");
        }

    }

    private static void assertEqualsFor(int expected, int actual, String name) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Item: \t\t" + name);
        System.out.println("Expected: \t" + expected);
        System.out.println("Actual: \t" + actual);
        if (expected != actual) throw new RuntimeException("Incorrect answer");
        System.out.println("Your answer is correct");
    }

}
