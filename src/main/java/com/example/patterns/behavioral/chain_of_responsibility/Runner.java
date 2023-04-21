package com.example.patterns.behavioral.chain_of_responsibility;

public class Runner {
    public static void main(final String[] args) {
        Chain chain = new Chain();

        // Calling chain of responsibility
        chain.process(new Number(90));
        chain.process(new Number(-50));
        chain.process(new Number(0));
        chain.process(new Number(91));
    }
}
