package org.example.Factories;

import org.example.Shapes.Circle;
import org.example.Shapes.Shape;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
