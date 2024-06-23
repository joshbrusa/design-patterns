package org.example;


import org.example.Creator.ConcreteCreatorA;
import org.example.Creator.ConcreteCreatorB;
import org.example.Creator.Creator;

public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();
    }
}