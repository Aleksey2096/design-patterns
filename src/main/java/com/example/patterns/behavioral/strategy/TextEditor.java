package com.example.patterns.behavioral.strategy;

public class TextEditor {
    private final TextFormatter textFormatter;

    public TextEditor(final TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(final String text) {
        textFormatter.format(text);
    }
}