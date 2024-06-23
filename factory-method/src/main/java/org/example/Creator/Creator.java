package org.example.Creator;

import org.example.Product.Product;

public abstract class Creator {
    public abstract Product factoryMethod();

    public void someOperation() {
        // call factory method to create a product object
        Product product = factoryMethod();

        // use the created product
        product.use();
    }
}
