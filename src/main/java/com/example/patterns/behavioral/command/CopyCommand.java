package com.example.patterns.behavioral.command;

public class CopyCommand extends Command {

	public CopyCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		editor.setClipboard(editor.getTextField().getSelectedText());
		return false;
	}
}
