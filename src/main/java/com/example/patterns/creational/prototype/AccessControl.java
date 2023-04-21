package com.example.patterns.creational.prototype;

public class AccessControl implements Prototype {
    private final String controlLevel;
    private String access;

    public AccessControl(final String controlLevel, final String access) {
        this.controlLevel = controlLevel;
        this.access = access;
    }

    @Override
    public AccessControl clone() {
        try {
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getControlLevel() {
        return controlLevel;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(final String access) {
        this.access = access;
    }
}
