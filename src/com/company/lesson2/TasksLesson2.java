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

class Task5 {

    private static double inchToCm = 2.54;

    public static void main(String[] args) {
        double inch = 1;
        double   cm = inch *  inchToCm;
        for(int i = 1; i <= 20; i++) {
            System.out.println(i + " inch = " + cm + " cm");
            cm = inchToCm * (i + 1);
        }
    }
}

class Task6 {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++) {
            if( (i & 1) == 0) {
                System.out.println(i);
            }
        }
    }
}

class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 100; i+=2)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}

class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = in.nextInt();

        for(int i = 0; i < length; i++)
        {
            for(int j = length - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++) {
               System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();

        for(int i = 0; i < length; i++)
        {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = length - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++) {
                System.out.printf("%-3d ", i*j);
            }
            System.out.println();
        }
    }
}