package org.example;

public class Connection {

    // private static variable of the single instance
    private static Connection instance;

    // private constructor to prevent instantiation
    private Connection() {
    }

    // public method to provide access to the instance
    public static Connection getInstance() {
        if (instance == null) {
            synchronized (Connection.class) {
                if (instance == null) {
                    instance = new Connection();
                }
            }
        }
        return instance;
    }

    // example method
    public void showMessage() {
        System.out.println("Hello, I am a connection!");
    }
}
