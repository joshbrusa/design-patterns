package org.example;

public class Display implements Listener {
    private final String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " Display: Temperature updated to " + temperature + " degrees.");
    }
}
