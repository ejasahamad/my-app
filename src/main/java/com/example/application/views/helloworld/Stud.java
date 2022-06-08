package com.example.application.views.helloworld;

public class Stud {
    private String name;

    private int roll;
    
    public int getRoll() {
        return roll;
    }

    public Stud(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
