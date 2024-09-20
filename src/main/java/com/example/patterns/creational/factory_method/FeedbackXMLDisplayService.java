package com.example.patterns.creational.factory_method;

public class FeedbackXMLDisplayService extends DisplayService {

	@Override
	public XMLParser getParser() {
		return new FeedbackXMLParser();
	}
}
