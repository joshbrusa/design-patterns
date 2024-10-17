package org.example;

public class Chess extends Game {
    @Override
    protected void initialize() {
        System.out.println("Chess Game Initialized.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Chess Game Started.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Chess Game Ended.");
    }
}
