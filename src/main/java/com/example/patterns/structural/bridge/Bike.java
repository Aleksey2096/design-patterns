package com.example.patterns.structural.bridge;

//Refine abstraction 2 in bridge pattern
class Bike extends Vehicle {
    public Bike(final Workshop workShop1, final Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Bike ");
        workShop1.work();
        workShop2.work();
    }
}