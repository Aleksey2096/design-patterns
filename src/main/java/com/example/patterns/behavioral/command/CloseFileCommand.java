package com.example.patterns.behavioral.command;

public class CloseFileCommand implements Command {
    private final FileSystemReceiver fileSystem;

    public CloseFileCommand(final FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}