package org.example;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("State changed to: " + state);
    }

    public String getState() {
        return state;
    }

    public Snapshot saveStateToSnapshot() {
        return new Snapshot(state);
    }

    public void getStateFromSnapshot(Snapshot snapshot) {
        state = snapshot.getState();
        System.out.println("State restored to: " + state);
    }
}
