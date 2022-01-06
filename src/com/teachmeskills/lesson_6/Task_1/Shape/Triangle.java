package com.teachmeskills.lesson_6.Task_1.Shape;

public class Triangle implements Shapes {

    int q;
    int r;

    public Triangle(int q, int r) {
        this.q = q;
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        double l = 0.5 * (q + r);
        return l;
    }

    @Override
    public double calculateSquare() {
        return q + r;
    }
}