package com.test.patterns.visitor;

public class PriceVisitor implements MenuItemVisitor {

    @Override
    public void visit(MenuItem item) {
        String price = "100"; // do logic to get pricing
        item.setAttribute("price", price);
    }

}
