package com.bytefalcons.gandalf.designpatterns.behavioral.memento;

public class Originator {

    private String state;

    public Memento createState() {
        return new Memento(state);
    }

    public void restoreState(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
