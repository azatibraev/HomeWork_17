package com.company;

public class Eagle extends Animal {

    private String beak;

    public Eagle(){

    }

    public Eagle(String beak) {
        this.beak = beak;
    }

    public String getBeak() {
        return beak;
    }

    public void setBeak(String beak) {
        this.beak = beak;
    }

    public void fly(){
        System.out.println("Eagle is flying");
    }

    @Override
    public String toString() {
        return "Eagle:" + '\n' +
                "beak: " + beak + '\n' + super.toString();
    }
}
