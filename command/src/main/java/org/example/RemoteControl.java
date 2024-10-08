package org.example;

public class RemoteControl {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void pressButton() {
        action.execute();
    }
}
