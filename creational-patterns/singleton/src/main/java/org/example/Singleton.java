package org.example;

public class Singleton {

    // private static variable of the single instance
    private static Singleton instance;

    // private constructor to prevent instantiation
    private Singleton() {
    }

    // public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // example method
    public void showMessage() {
        System.out.println("Hello, I am a singleton!");
    }
}
