package com.example.patterns.behavioral.command;

public abstract class Command {
	private String backup;
	protected Editor editor;

	public Command(Editor editor) {
		this.editor = editor;
	}

	public void backup() {
		backup = editor.getTextField().getText();
	}

	public void undo() {
		editor.getTextField().setText(backup);
	}

	public abstract boolean execute();
}
