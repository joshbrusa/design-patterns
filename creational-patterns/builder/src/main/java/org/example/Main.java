package org.example;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12)
                .cheese(true)
                .pepperoni(true)
                .bacon(true)
                .build();

        System.out.println(pizza);
    }
}