package org.example;

public class TemplateMethod {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();  // Football-specific play process

        System.out.println();

        Game chess = new Chess();
        chess.play();  // Chess-specific play process
    }
}