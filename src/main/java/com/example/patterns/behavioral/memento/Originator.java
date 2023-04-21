package com.example.patterns.behavioral.memento;

public class Originator {

    private double x;
    private double y;

    private String lastUndoSavepoint;
    CareTaker careTaker;

    public Originator(final double x, final double y,
                      final CareTaker careTaker) {
        this.x = x;
        this.y = y;

        this.careTaker = careTaker;

        createSavepoint("INITIAL");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public void setY(final double y) {
        this.y = y;
    }

    public void createSavepoint(final String savepointName) {
        careTaker.saveMemento(new Memento(this.x, this.y), savepointName);
        lastUndoSavepoint = savepointName;
    }

    public void undo() {
        setOriginatorState(lastUndoSavepoint);
    }

    public void undo(final String savepointName) {
        setOriginatorState(savepointName);
    }

    public void undoAll() {
        setOriginatorState("INITIAL");
        careTaker.clearSavePoints();
    }

    private void setOriginatorState(final String savepointName) {
        Memento mem = careTaker.getMemento(savepointName);
        this.x = mem.x();
        this.y = mem.y();
    }

    @Override
    public String toString() {
        return "X: " + x + ", Y: " + y;
    }
}