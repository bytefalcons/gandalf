package com.bytefalcons.gandalf.designpatterns.creational.singleton;

public enum MotorCycle {

    INSTANCE("Harley Davison");

    private String make;

    MotorCycle(String make) {
        this.make = make;
    }

    public MotorCycle getInstance() {
        return INSTANCE;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
