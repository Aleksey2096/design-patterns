package com.example.patterns.creational.prototype;

public class User {
    private String userName;
    private String level;
    private AccessControl accessControl;

    public User(final String userName, final String level,
                final AccessControl accessControl) {
        this.userName = userName;
        this.level = level;
        this.accessControl = accessControl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(final String level) {
        this.level = level;
    }

    public AccessControl getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(final AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    @Override
    public String toString() {
        return "Name: " + userName + ", Level: " + level
                + ", Access Control Level:"
                + accessControl.getControlLevel() + ", Access: "
                + accessControl.getAccess();
    }
}
