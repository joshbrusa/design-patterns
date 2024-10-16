package org.example;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

    private final List<AUser> users = new ArrayList<>();

    @Override
    public void addUser(AUser user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, AUser user) {
        for (AUser u : this.users) {
            // message should not be received by the user who sends it
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
