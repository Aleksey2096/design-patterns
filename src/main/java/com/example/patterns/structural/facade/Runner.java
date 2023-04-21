package com.example.patterns.structural.facade;

public class Runner {
	public static void main(final String[] args) {
		ReportGeneratorFacade.generateReport(ReportType.HTML, null);

		ReportGeneratorFacade.generateReport(ReportType.PDF, null);
	}
}
