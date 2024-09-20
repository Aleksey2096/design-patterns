package com.example.patterns.creational.abstract_factory;

public class TWParserFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {
		return switch (parserType) {
		case "TW_ERROR" -> new TWErrorXMLParser();
		case "TW_FEEDBACK" -> new TWFeedbackXMLParser();
		default -> null;
		};
	}
}