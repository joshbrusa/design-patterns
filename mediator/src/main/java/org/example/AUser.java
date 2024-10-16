package org.example;

public abstract class AUser {

    protected IChatMediator mediator;
    protected String name;

    public AUser(IChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
