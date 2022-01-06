package com.teachmeskills.lesson_6.Task_1.Array;

import com.teachmeskills.lesson_6.Task_1.Shape.Circle;
import com.teachmeskills.lesson_6.Task_1.Shape.Rectangle;
import com.teachmeskills.lesson_6.Task_1.Shape.Shapes;
import com.teachmeskills.lesson_6.Task_1.Shape.Triangle;
import com.teachmeskills.lesson_6.Task_1.Util.Util;

/**
 * 1. Написать иерархию классов «Фигуры».
 * Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
 * Создать массив из 5 фигур.
 * Вывести на экран сумму периметра всех фигур в массиве.
 */

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(15, 5);

        Rectangle rectangle1 = new Rectangle(20, 15);

        Circle circle = new Circle(20);

        Shapes[] arryshapes = new Shapes[]{triangle1, rectangle1, circle};

        for (Shapes sh : arryshapes) {
            System.out.println("square: " + sh.getClass().getCanonicalName() + " = " + sh.calculateSquare());
            System.out.println("perimeter: " + sh.getClass().getCanonicalName() + " = " + sh.calculatePerimeter());
        }
        Util util = new Util ();
        System.out.println("Сумма периметра всех фигур: " + util.calculateAllPerimeters(arryshapes));
    }
}