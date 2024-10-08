package org.example;

public class Proxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Image is loaded only on the first display call
        image.display();
        System.out.println("");

        // Image is displayed without loading again
        image.display();
    }
}