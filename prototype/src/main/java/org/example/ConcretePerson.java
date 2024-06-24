package org.example;

public class ConcretePerson implements Person {
    private String name;

    public ConcretePerson(String name) {
        this.name = name;
    }

    @Override
    public Person clone() {
        return new ConcretePerson(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePerson{name='" + name + '\'' + '}';
    }
}
