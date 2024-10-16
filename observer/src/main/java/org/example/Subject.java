package org.example;

public interface Subject {
    void registerListener(Listener l);
    void removeListener(Listener l);
    void notifyListeners();
}
