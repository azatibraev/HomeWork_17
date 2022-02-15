package com.company;

public class Turtle extends Animal {

    private String description;

    public Turtle(){

    }
    public Turtle(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void swim(){
        System.out.println("Turtle is swimming");
    }

    @Override
    public String toString() {
        return "Turtle: " + '\n' +
                "description: " + description + '\n' + super.toString();
    }
}