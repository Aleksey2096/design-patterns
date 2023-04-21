package com.example.patterns.behavioral.interpreter;

public class Number implements Expression {

    private final int n;

    public Number(final int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }
}