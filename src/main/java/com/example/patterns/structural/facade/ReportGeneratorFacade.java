package com.example.patterns.structural.facade;

public class ReportGeneratorFacade {
    public static void generateReport(final ReportType type,
                                      final String location) {
        if (type == null) {
            throw new RuntimeException();
        }
        // Create report
        Report report = new Report();

        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());

        // Get data from dataSource and set to ReportData object

        report.setData(new ReportData());

        // Write report
        ReportWriter writer = new ReportWriter();
        switch (type) {
            case HTML -> writer.writeHtmlReport(report, location);
            case PDF -> writer.writePdfReport(report, location);
        }
    }
}