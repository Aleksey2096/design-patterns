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

    public Car(final String carType) {
        this.carType = carType;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(final String newBodyStyle) {
        bodyStyle = newBodyStyle;
    }

    public String getPower() {
        return power;
    }

    public void setPower(final String newPower) {
        power = newPower;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(final String newEngine) {
        engine = newEngine;
    }

    public String getBreaks() {
        return breaks;
    }

    public void setBreaks(final String newBreaks) {
        breaks = newBreaks;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(final String newSeats) {
        seats = newSeats;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(final String newWindows) {
        windows = newWindows;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(final String newFuelType) {
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
