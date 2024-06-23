package org.example.Factories;

import org.example.Shapes.Rectangle;
import org.example.Shapes.Shape;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
