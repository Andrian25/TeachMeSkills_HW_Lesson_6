package com.teachmeskills.lesson_6.Task_2;

public class Worker implements Work {

    String name;
    String position;

    public Worker(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}