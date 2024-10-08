package org.example;

public class Command {
    public static void main(String[] args) {
        Light light = new Light();
        Action lightOn = new LightOnAction(light);
        Action lightOff = new LightOffAction(light);

        RemoteControl remote = new RemoteControl();

        remote.setAction(lightOn);
        remote.pressButton();

        remote.setAction(lightOff);
        remote.pressButton();
    }
}