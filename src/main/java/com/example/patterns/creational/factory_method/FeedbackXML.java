package com.example.patterns.creational.factory_method;

public class FeedbackXML implements XMLParser {

    @Override
    public String parse() {
        System.out.println("Parsing feedback XML...");
        return "Feedback XML Message";
    }
}
