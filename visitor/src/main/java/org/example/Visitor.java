package org.example;

public class Visitor {
    public static void main(String[] args) {
        Element[] elements = new Element[]{new Book("Java Design Patterns"), new Magazine("Tech Monthly")};

        PriceOperation priceOperation = new PriceOperation();
        for (Element element : elements) {
            element.accept(priceOperation);
        }
    }
}