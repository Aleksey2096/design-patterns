package com.example.patterns.behavioral.strategy;

public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(final String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
}
