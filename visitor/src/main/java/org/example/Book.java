package org.example;

public class Book implements Element {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void accept(Operation operation) {
        operation.perform(this);
    }
}
