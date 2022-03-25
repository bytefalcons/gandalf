package com.bytefalcons.gandalf.designpatterns.creational.singleton;

public class Car {

    private static Car instance;

    private String make = "Ford";

    private Car() {}

    public static Car getInstance() {
        if(null == instance) {
            instance = new Car();
        }
        return instance;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
