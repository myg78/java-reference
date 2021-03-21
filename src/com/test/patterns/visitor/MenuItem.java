package com.test.patterns.visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MenuItem implements Consumer<MenuItemVisitor> {

    private Map<String, String> attributes = new HashMap<>();

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public void setAttribute(String key, String value) {
        attributes.put(key, value);
    }

    @Override
    public void accept(MenuItemVisitor visitor) {
        visitor.visit(this);
    }

}
