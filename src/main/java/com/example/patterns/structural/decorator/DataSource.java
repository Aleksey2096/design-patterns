package com.example.patterns.structural.decorator;

public interface DataSource {
	void writeData(String data);

	String readData();
}
