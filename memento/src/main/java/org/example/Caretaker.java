package org.example;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Snapshot> snapshotList = new ArrayList<>();

    public void add(Snapshot state) {
        snapshotList.add(state);
    }

    public Snapshot get(int index) {
        return snapshotList.get(index);
    }
}
