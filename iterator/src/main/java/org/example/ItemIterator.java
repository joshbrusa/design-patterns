package org.example;

import java.util.Iterator;

public class ItemIterator implements Iterator<String> {

    private final ItemCollection collection;
    private int currentIndex = 0;

    public ItemIterator(ItemCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < collection.getItems().size();
    }

    @Override
    public String next() {
        return collection.getItems().get(currentIndex++);
    }
}
