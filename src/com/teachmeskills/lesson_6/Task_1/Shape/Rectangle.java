package com.teachmeskills.lesson_6.Task_1.Shape;

public class Rectangle implements Shapes {

    int w;
    int l;

    public Rectangle(int l, int w) {
        this.w = w;
        this.l = l;
    }

    @Override
    public double calculatePerimeter() {
        int a;
        a = (w + l) * 2;
        return a;
    }

    @Override
    public double calculateSquare() {

        return w * l;
    }
}