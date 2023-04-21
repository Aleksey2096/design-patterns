package com.example.patterns.structural.adapter;

class BirdAdapter implements ToyDuck {
    // You need to implement the interface your
    // client expects to use.
    Bird bird;

    public BirdAdapter(final Bird bird) {
        // we need reference to the object we
        // are adapting
        this.bird = bird;
    }

    @Override
    public void squeak() {
        // translate the methods appropriately
        bird.makeSound();
    }
}