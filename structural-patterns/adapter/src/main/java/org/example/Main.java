package org.example;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Shape shape = new RectangleAdapter(rectangle);
        shape.draw();
    }
}