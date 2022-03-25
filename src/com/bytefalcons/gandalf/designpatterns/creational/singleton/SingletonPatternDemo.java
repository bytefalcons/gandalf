package com.bytefalcons.gandalf.designpatterns.creational.singleton;

public class SingletonPatternDemo {

    public static void singleThread() {
        System.out.println("=== Class Singleton ===");
        Car car1 = Car.getInstance();
        Car car2 = Car.getInstance();

        System.out.println("Car1 - " + car1.getMake());
        System.out.println("Car2 - " + car2.getMake());

        System.out.println("Updating Model!!");
        car1.setMake("Jeep");

        System.out.println("Car1 - " + car1.getMake());
        System.out.println("Car2 - " + car2.getMake());

        System.out.println(car1 == car2);

        System.out.println("=== Enum Singleton ===");

        MotorCycle motorCycle1 = MotorCycle.INSTANCE.getInstance();
        MotorCycle motorCycle2 = MotorCycle.INSTANCE.getInstance();

        System.out.println("MotorCycle1 - " + motorCycle1.getMake());
        System.out.println("MotorCycle2 - " + motorCycle2.getMake());

        motorCycle1.setMake("Hero");

        System.out.println("MotorCycle1 - " + motorCycle1.getMake());
        System.out.println("MotorCycle2 - " + motorCycle2.getMake());
    }


    public static void multipleThread() {

        Thread t1 = new Thread(() -> {
            System.out.println("Starting Thread - A");
            Car car = Car.getInstance();
            System.out.println(Thread.currentThread().getName() + " : " + car.hashCode());
        });
        t1.setName("Thread => A");

        Thread t2 = new Thread(() -> {
            System.out.println("Starting Thread - B");
            Car car = Car.getInstance();
            System.out.println(Thread.currentThread().getName() + " : " + car.hashCode());
        });
        t2.setName("Thread => B");

        t1.start();
        t2.start();

        Thread t3 = new Thread(() -> {
            System.out.println("Starting Thread - C");
            MotorCycle motorCycle = MotorCycle.INSTANCE.getInstance();
            System.out.println(Thread.currentThread().getName() + " : " + motorCycle.hashCode());
        });
        t3.setName("Thread => C");

        Thread t4 = new Thread(() -> {
            System.out.println("Starting Thread - D");
            MotorCycle motorCycle = MotorCycle.INSTANCE.getInstance();
            System.out.println(Thread.currentThread().getName() + " : " + motorCycle.hashCode());
        });
        t4.setName("Thread => D");


        t3.start();
        t4.start();

    }

    public static void main(String[] args) {
        //singleThread();

       multipleThread();
    }
}

