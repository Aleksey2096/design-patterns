package com.example.patterns.creational.factory_method;

public class ErrorXMLDisplayService extends DisplayService {

	@Override
	public XMLParser getParser() {
		return new ErrorXMLParser();
	}
}
