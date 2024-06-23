package org.example;

import org.example.Factories.CircleFactory;
import org.example.Factories.RectangleFactory;
import org.example.Factories.ShapeFactory;
import org.example.Shapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }
}
