package com.example.patterns.creational.builder;

public class CarDirector {
	CarBuilder carBuilder;

	public CarDirector(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	public Car build() {
		carBuilder.buildBodyStyle();
		carBuilder.buildPower();
		carBuilder.buildEngine();
		carBuilder.buildBreaks();
		carBuilder.buildSeats();
		carBuilder.buildWindows();
		carBuilder.buildFuelType();
		return carBuilder.getCar();
	}
}
