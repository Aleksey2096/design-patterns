package com.example.patterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private final Map<String, Memento> savepointStorage = new HashMap<>();

    public void saveMemento(final Memento memento, final String savepointName) {
        System.out.println("Saving state..." + savepointName);
        savepointStorage.put(savepointName, memento);
    }

    public Memento getMemento(final String savepointName) {
        System.out.println("Undo at ..." + savepointName);
        return savepointStorage.get(savepointName);
    }

    public void clearSavePoints() {
        System.out.println("Clearing all save points...");
        savepointStorage.clear();
    }
}
