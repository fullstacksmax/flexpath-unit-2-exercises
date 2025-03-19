package org.example;

public class Lion extends Animal  {
    public Lion(String name) {
        super(name);
    }

    @Override
    public String eat() {
        return name + " is eating.";
    }

    @Override
    public String sleep() {
        return name + " is sleeping. " + name + " dreams of a delicious steak.";
    }
    @Override
    public String speak() {
        return name + " lets out a loud ROAR!";
    }
}