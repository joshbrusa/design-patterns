package org.example;

public class PriceOperation implements Operation {
    @Override
    public void perform(Book book) {
        System.out.println("The price of the book '" + book.getTitle() + "' is $10.");
    }

    @Override
    public void perform(Magazine magazine) {
        System.out.println("The price of the magazine '" + magazine.getName() + "' is $5.");
    }
}
