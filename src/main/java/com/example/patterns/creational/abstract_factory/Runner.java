package com.example.patterns.creational.abstract_factory;

public class Runner {
	public static void main(String[] args) {
		AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");
		XMLParser parser = parserFactory.getParserInstance("NY_ERROR");
		String msg;
		msg = parser.parse();
		System.out.println(msg);

		System.out.println("************************************");

		parserFactory = ParserFactoryProducer.getFactory("TWFactory");
		parser = parserFactory.getParserInstance("TW_FEEDBACK");
		msg = parser.parse();
		System.out.println(msg);
	}
}
