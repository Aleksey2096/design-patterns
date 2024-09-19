package com.example.patterns.behavioral.memento;

public class Originator {

	private double x;
	private double y;
	private CareTaker careTaker;

	private String lastUndoSavepoint;

	public Originator(double x, double y, CareTaker careTaker) {
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

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void createSavepoint(String savepointName) {
		careTaker.saveMemento(new Memento(this.x, this.y), savepointName);
		lastUndoSavepoint = savepointName;
	}

	public void undo() {
		setOriginatorState(lastUndoSavepoint);
	}

	public void undo(String savepointName) {
		setOriginatorState(savepointName);
	}

	public void undoAll() {
		setOriginatorState("INITIAL");
		careTaker.clearSavePoints();
	}

	@Override
	public String toString() {
		return "X: " + x + ", Y: " + y;
	}

	private void setOriginatorState(String savepointName) {
		Memento mem = careTaker.getMemento(savepointName);
		this.x = mem.x();
		this.y = mem.y();
	}
}