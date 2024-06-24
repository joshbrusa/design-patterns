package org.example.Creator;

import org.example.Product.ConcreteProductA;
import org.example.Product.Product;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
