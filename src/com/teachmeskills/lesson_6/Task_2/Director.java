package com.teachmeskills.lesson_6.Task_2;

public class Director implements Work {

    String name;
    String position;

    public Director(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}