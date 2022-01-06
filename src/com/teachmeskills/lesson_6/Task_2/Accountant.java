package com.teachmeskills.lesson_6.Task_2;

public class Accountant implements Work {

    String name;
    String position;

    public Accountant(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}