package com.example.patterns.behavioral.chain_of_responsibility;

class Number {
    private final int number;

    public Number(final int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}