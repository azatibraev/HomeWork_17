package com.company;

import java.util.Arrays;

public class Animal {
    private Shark[] sharks;
    private Turtle[] Turtles;
    private Eagle[] eagles;

    public void breath() {
        System.out.println(" Animal is breathing");
    }

    public Animal() {
    }

    public Animal(Shark[] sharks, Turtle[] turtles, Eagle[] eagles) {
        this.sharks = sharks;
        Turtles = turtles;
        this.eagles = eagles;
    }

    public Shark[] getSharks() {
        return sharks;
    }

    public void setSharks(Shark[] sharks) {
        this.sharks = sharks;
    }

    public Turtle[] getTurtles() {
        return Turtles;
    }

    public void setTurtles(Turtle[] turtles) {
        Turtles = turtles;
    }

    public Eagle[] getEagles() {
        return eagles;
    }

    public void setEagles(Eagle[] eagles) {
        this.eagles = eagles;
    }

    @Override
    public String toString() {
        return "Animal: " + '\n' +
                "sharks: " + Arrays.toString(sharks) + '\n' +
                "Turtles: " + Arrays.toString(Turtles) + '\n' +
                "eagles: " + Arrays.toString(eagles);
    }
}