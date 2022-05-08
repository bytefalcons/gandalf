package com.bytefalcons.gandalf.designpatterns.behavioral.memento;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("A");
        careTaker.add(originator.createState());
        originator.setState("B");
        careTaker.add(originator.createState());

        originator.setState("C");
        careTaker.add(originator.createState());
        originator.setState("D");
        careTaker.add(originator.createState());

        System.out.println("Current State :"+originator.getState());

        originator.restoreState(careTaker.get(1));
        System.out.println("Current State :"+originator.getState());

        System.out.println(careTaker);
    }

}
