package org.example;

public class Elephant extends Animal  {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public String eat() {
        return name + " is eating.";
    }

    @Override
    public String sleep() {
        return name + " is sleeping.";
    }
    @Override
    public String speak() {
        return name + " makes a loud trumpet sound.";
    }
}
