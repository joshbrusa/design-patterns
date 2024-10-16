package org.example;

public class Memento {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToSnapshot());

        originator.setState("State #3");
        caretaker.add(originator.saveStateToSnapshot());

        originator.setState("State #4");

        // Restore the previous states
        originator.getStateFromSnapshot(caretaker.get(0));
        originator.getStateFromSnapshot(caretaker.get(1));
    }
}