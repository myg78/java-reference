package com.test.patterns.visitor;

public class AttributesVisitor implements MenuItemVisitor {

    @Override
    public void visit(MenuItem item) {
        item.setAttribute("name", "test name");
        item.setAttribute("description", "sample description");
    }

}
