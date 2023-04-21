package com.example.patterns.structural.flyweight;

//Terrorist must have weapon and mission
class Terrorist implements Player {
    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public Terrorist() {
        TASK = "PLANT A BOMB";
    }

    @Override
    public void assignWeapon(final String weapon) {
        // Assign a weapon
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        // Work on the Mission
        System.out.println(
                "Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
}