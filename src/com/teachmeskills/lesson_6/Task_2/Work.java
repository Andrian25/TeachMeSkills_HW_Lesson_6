package com.teachmeskills.lesson_6.Task_2;

public interface Work {

    default String printJobTitle(Work work) {
        return work.toString();
    }
}