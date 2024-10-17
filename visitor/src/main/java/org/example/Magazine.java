package org.example;

public class Magazine implements Element {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Operation operation) {
        operation.perform(this);
    }
}
