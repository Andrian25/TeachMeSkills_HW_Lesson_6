package com.teachmeskills.lesson_6.Task_2;

/**
 * 2. Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом,
 * который печатает название должности и имплементировать этот метод в созданные классы.
 */

public class Main {

    public static void main(String[] args) {

        Director director1 = new Director("Иван", "Директор");
        Accountant accountant1 = new Accountant("Вика", "Бухгалтер");
        Worker worker1 = new Worker("Максим", "Рабочий");

        System.out.println("Employee position :" + director1.printJobTitle(director1));
        System.out.println("Employee position :" + accountant1.printJobTitle(accountant1));
        System.out.println("Employee position :" + worker1.printJobTitle(worker1));
    }
}