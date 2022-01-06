package com.teachmeskills.lesson_6.Task_1.Shape;

public class Circle implements Shapes {

    int p;

    public Circle(int p) {

        this.p = p;
    }

    @Override
    public double calculatePerimeter() {
        double s = Math.PI * p * p;
        return s;
    }

    @Override
    public double calculateSquare() {

        return Math.PI * p * p;
    }
}