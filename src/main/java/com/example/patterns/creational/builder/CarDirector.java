package com.example.patterns.creational.builder;

public class CarDirector {
    CarBuilder carBuilder;

    public CarDirector(final CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car build() {
        this.carBuilder.buildBodyStyle();
        this.carBuilder.buildPower();
        this.carBuilder.buildEngine();
        this.carBuilder.buildBreaks();
        this.carBuilder.buildSeats();
        this.carBuilder.buildWindows();
        this.carBuilder.buildFuelType();
        return this.carBuilder.getCar();
    }
}
