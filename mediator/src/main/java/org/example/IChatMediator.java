package org.example;

public interface IChatMediator {
    void sendMessage(String message, AUser user);
    void addUser(AUser user);
}
