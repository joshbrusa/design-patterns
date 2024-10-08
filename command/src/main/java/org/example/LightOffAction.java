package org.example;

public class LightOffAction implements Action {
    private Light light;

    public LightOffAction(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}
