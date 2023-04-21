package com.example.patterns.creational.abstract_factory;

public final class ParserFactoryProducer {

    private ParserFactoryProducer() {
        throw new AssertionError();
    }

    public static AbstractParserFactory getFactory(final String factoryType) {
        return switch (factoryType) {
            case "NYFactory" -> new NYParserFactory();
            case "TWFactory" -> new TWParserFactory();
            default -> null;
        };
    }
}