package com.test.patterns.visitor;

public class TestVisitor {

    public static void main(String[] args) {
        MenuItem item = new MenuItem();
        PriceVisitor priceVisitor = new PriceVisitor();
        item.accept(priceVisitor);
        System.out.println(item.getAttributes());

        AttributesVisitor attributesVisitor = new AttributesVisitor();
        item.accept(attributesVisitor);
        System.out.println(item.getAttributes());
    }

}
