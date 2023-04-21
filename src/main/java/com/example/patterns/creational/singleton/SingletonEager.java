package com.example.patterns.creational.singleton;

public class SingletonEager {
    private static final SingletonEager sc = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return sc;
    }
}
