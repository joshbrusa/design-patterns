package org.example;

public class Adapter {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Shape shape = new RectangleAdapter(rectangle);
        shape.draw();
    }
}