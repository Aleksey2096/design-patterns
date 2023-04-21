package com.example.patterns.behavioral.strategy;

public class LowerTextFormatter implements TextFormatter {
    @Override
    public void format(final String text) {
        System.out.println("[LowerTextFormatter]: " + text.toLowerCase());
    }
}
