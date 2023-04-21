package com.example.patterns.creational.singleton;

public class SingletonLazyMultiThreaded {
    private static SingletonLazyMultiThreaded sc = null;

    private SingletonLazyMultiThreaded() {
    }

    public static synchronized SingletonLazyMultiThreaded getInstance() {
        if (sc == null) {
            sc = new SingletonLazyMultiThreaded();
        }
        return sc;
    }
}
