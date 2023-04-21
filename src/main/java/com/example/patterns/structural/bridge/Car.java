package com.example.patterns.structural.bridge;

//Refine abstraction 1 in bridge pattern
class Car extends Vehicle {
    public Car(final Workshop workShop1, final Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Car ");
        workShop1.work();
        workShop2.work();
    }
}