package org.example;

public class Singleton {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        connection.showMessage();
    }
}