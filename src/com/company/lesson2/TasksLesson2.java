package com.company.lesson2;

import java.util.Scanner;

public class TasksLesson2 {
}

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

class Task2 {
    public static void main(String[] args) {

        int numOfSells = 1;
        for(int hours = 3; hours <=24; hours+=3)
        {
            numOfSells *= 2;
            System.out.println("Через " + hours + " часа будет " + numOfSells + " клеток");
        }
    }
}

class Task3 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 1;
        while( i <= 256 ) { sum += i*=2; }
        System.out.println(sum);
    }
}

class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("Enter two numbers: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int comp = 0;
            for (int i = 0; i < a; i++) {
                comp += b;
            }
            System.out.println(a + " * " + b + " = " + comp);
    }
}