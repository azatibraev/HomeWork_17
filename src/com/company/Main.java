package com.company;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        Shark shark = new Shark("BARNABY");
        Turtle turtle = new Turtle("Turtles are reptiles with hard shells that protect them from predators. ");
        Eagle eagle = new Eagle("Cadual Beak");
        Animal[] animal = {new Shark(), new Turtle(), new Eagle()};

        for (Animal animals : animal) {
            if (animals instanceof Shark) {
                ((Shark) animals).attack();
            }
            if (animals.getClass().getName().equals("HomeWork_17.Shark")) {
                assert animals instanceof Shark;
                ((Shark) animals).attack();
            }
            if (animals instanceof Turtle) {
                ((Turtle) animals).swim();
            }
            if (animals.getClass().getName().equals("HomeWork_17.Turtle")) {
                assert animals instanceof Turtle;
                ((Turtle) animals).swim();
            }
            if (animals instanceof Eagle) {
                ((Eagle) animals).fly();
            }
            if (animals.getClass().getName().equals("HomeWork_17.Eagle")) {
                assert animals instanceof Eagle;
                ((Eagle) animals).fly();
            }
        }

        Shark[] sharks = new Shark[]{shark};
        Turtle[] turtles = new Turtle[]{turtle};
        Eagle[] eagles = new Eagle[]{eagle};
        System.out.println(Arrays.toString(sharks) + "\n" + Arrays.toString(turtles) + "\n" + Arrays.toString(eagles));

    } //I didn't find a solution with outputting an array to the console, where the array has a value is null
}