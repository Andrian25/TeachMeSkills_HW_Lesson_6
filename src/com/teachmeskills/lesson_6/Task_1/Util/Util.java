package com.teachmeskills.lesson_6.Task_1.Util;

import com.teachmeskills.lesson_6.Task_1.Shape.Shapes;


public class Util {

    public  double calculateAllPerimeters(Shapes[] shapes) {

        double sum = 0;

        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].calculatePerimeter();
        }
        return sum;
    }
}
