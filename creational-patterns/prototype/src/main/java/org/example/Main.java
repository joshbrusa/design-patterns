package org.example;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype("Prototype1");
        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();

        System.out.println("Original: " + prototype1);
        System.out.println("Clone: " + prototype2);

        prototype2.setName("Prototype2");
        System.out.println("After modifying clone:");
        System.out.println("Original: " + prototype1);
        System.out.println("Clone: " + prototype2);
    }
}