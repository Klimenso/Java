package com.company.lesson2;

public class TasksLesson2 {
}

/*1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        суммарный путь пробежит спортсмен за 7 дней?*/

class Task1 {
    public static void main(String[] args) {

        double klmts = 10;
        double sumKlmts = klmts;

        for (int i = 0; i < 6; i++) {

            klmts += klmts * 0.1;
            sumKlmts += klmts;
        }

        System.out.println("Kilometers in 7 days: " + sumKlmts);
    }
}