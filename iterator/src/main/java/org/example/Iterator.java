package org.example;

public class Iterator {
    public static void main(String[] args) {
        ItemCollection collection = new ItemCollection();
        collection.addItem("Item 1");
        collection.addItem("Item 2");
        collection.addItem("Item 3");

        java.util.Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}