package org.example;

public abstract class Game {
    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    // Steps to be implemented by subclasses
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
}
