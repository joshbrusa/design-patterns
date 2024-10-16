package org.example;

public class Mediator {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();

        User user1 = new User(mediator, "User 1");
        User user2 = new User(mediator, "User 2");
        User user3 = new User(mediator, "User 3");
        User user4 = new User(mediator, "User 4");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi Everyone!");
    }
}