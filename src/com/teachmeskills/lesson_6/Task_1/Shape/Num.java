package com.teachmeskills.lesson_6.Task_1.Shape;

public class Num {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(15, 5);

        System.out.println("square: " + rectangle1.calculateSquare());
        System.out.println("perimeter: " + rectangle1.calculatePerimeter());

        Triangle triangle1 = new Triangle(20, 15);

        System.out.println("square: " + triangle1.calculateSquare());
        System.out.println("perimetr: " + triangle1.calculatePerimeter());

        Circle circele1 = new Circle(20);

        System.out.println("square: " + circele1.calculateSquare());
        System.out.println("perimetr: " + circele1.calculatePerimeter());
    }
}