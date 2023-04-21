package com.example.patterns.structural.facade;

public class ReportWriter {

    public void writeHtmlReport(final Report report, final String location) {
        System.out.println("HTML Report written");

        // implementation
    }

    public void writePdfReport(final Report report, final String location) {
        System.out.println("PDF Report written");

        // implementation
    }
}