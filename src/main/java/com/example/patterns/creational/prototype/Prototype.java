package com.example.patterns.creational.prototype;

public interface Prototype extends Cloneable {
    AccessControl clone() throws CloneNotSupportedException;
}
