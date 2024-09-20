package com.example.patterns.creational.builder;

public class Car {
	private String bodyStyle;
	private String power;
	private String engine;
	private String breaks;
	private String seats;
	private String windows;
	private String fuelType;
	private final String carType;

	public Car(String carType) {
		this.carType = carType;
	}

	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String newBodyStyle) {
		bodyStyle = newBodyStyle;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String newPower) {
		power = newPower;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String newEngine) {
		engine = newEngine;
	}

	public String getBreaks() {
		return breaks;
	}

	public void setBreaks(String newBreaks) {
		breaks = newBreaks;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String newSeats) {
		seats = newSeats;
	}

	public String getWindows() {
		return windows;
	}

	public void setWindows(String newWindows) {
		windows = newWindows;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String newFuelType) {
		fuelType = newFuelType;
	}

	public String getCarType() {
		return carType;
	}

	@Override
	public String toString() {
		return "--------------" + carType
				+ "--------------------- \n"
				+ " Body: "
				+ bodyStyle
				+ "\n Power: "
				+ power
				+ "\n Engine: "
				+ engine
				+ "\n Breaks: "
				+ breaks
				+ "\n Seats: "
				+ seats
				+ "\n Windows: "
				+ windows
				+ "\n Fuel Type: "
				+ fuelType;
	}
}
