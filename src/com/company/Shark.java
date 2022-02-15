package com.company;

public class Shark extends Animal {

    private String name;

    public Shark(){

    }
    public Shark(String name) {
        this.name = name;
    }


    public void attack() {
        System.out.println("Shark is attacking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shark: " + '\n' +
                "name: " + name + '\n' + super.toString();
    }
}