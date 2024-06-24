package org.example;

public class Prototype {
    public static void main(String[] args) {
        ConcretePerson person1 = new ConcretePerson("Person1");
        ConcretePerson person2 = (ConcretePerson) person1.clone();

        System.out.println("Original: " + person1);
        System.out.println("Clone: " + person2);

        person2.setName("Person2");
        System.out.println("After modifying clone:");
        System.out.println("Original: " + person1);
        System.out.println("Clone: " + person2);
    }
}