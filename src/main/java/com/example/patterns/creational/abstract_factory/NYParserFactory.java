package com.example.patterns.creational.abstract_factory;

public class NYParserFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(final String parserType) {

        return switch (parserType) {
            case "NY_ERROR" -> new NYErrorXMLParser();
            case "NY_FEEDBACK" -> new NYFeedbackXMLParser();
            default -> null;
        };
    }
}
