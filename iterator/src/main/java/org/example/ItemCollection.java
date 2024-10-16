package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemCollection implements Iterable<String> {

    private final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public Iterator<String> iterator() {
        return new ItemIterator(this);
    }

    public List<String> getItems() {
        return items;
    }
}
