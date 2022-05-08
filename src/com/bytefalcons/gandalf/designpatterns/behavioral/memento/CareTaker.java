package com.bytefalcons.gandalf.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.Stack;

public class CareTaker {

    private ArrayList<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }

    @Override
    public String toString() {
        return "CareTaker{" +
                "mementos=" + mementos +
                '}';
    }
}
