package com.example.patterns.creational.abstract_factory;

public interface AbstractParserFactory {
    XMLParser getParserInstance(String parserType);
}
