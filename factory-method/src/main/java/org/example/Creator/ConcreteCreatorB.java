package org.example.Creator;

import org.example.Product.ConcreteProductB;
import org.example.Product.Product;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
