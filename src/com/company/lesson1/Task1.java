package com.company.lesson1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int num = -0;
        int count = 1;

        int i = num;
        while (0 != (i /= 10)) {
            count++;
        }

        String out;

        if (num > 0) {
            out = num + " Положительное " + count + "-значное";
        } else {
            if (num < 0) {
                out = num + " Отрицательное " + count + "-значное";
            } else {
                out = num + " - 0";
            }
        }
        System.out.println(out);
    }
}

class Task2 {

    public static void main(String[] args) {

        int a = 6;
        int b = 13;
        int c = 7;

        if(a+b > c && a+c > b && b+c > a)
        {

            System.out.println("Треугольник со сторонами: " + a + " " + b + " " + c
                    + " Возможен");

        } else {

            System.out.println("Треугольник со сторонами: " + a + " " + b + " " + c
                    + " не возможен");
        }

    }
}

class Task3 {

    public static void main(String[] args) {

        int a = 0;
        int b = a > 0 ? a + 1 : a < 0 ? a - 2 : 10;
        System.out.println("number -> " + a + "\nout -> " + b);
    }
}

class Task4 {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = 5;
        int count = 0;

        if(a >= 0) {
            count++;
        }
        if(b >= 0) {
            count++;
        }
        if(c >= 0) {
            count++;
        }

        String numCheck = count > 1 || count == 0 ? " положительных" : " положительное";
        System.out.println("Среди трех чисел: " + a + " " + b + " " + c + " ---> " + count + numCheck);
    }
}

class Task5 {

    public static void main(String[] args) {

        int a = 10;
        int b = -3;
        int c = 5;
        int count = 0;
        int negCount = 0;

        if(a >= 0) {
            count++;
        } else {
            negCount++;
        }
        if(b >= 0) {
            count++;
        } else {
            negCount++;
        }
        if(c >= 0) {
            count++;
        } else {
            negCount++;
        }

        String numCheck = count > 1 || count == 0 ? " положительных" : " положительное";
        System.out.println("Среди трех чисел: " + a + " " + b + " " + c + " ---> " + count + numCheck);
        String numNegCheck = negCount > 1 || negCount == 0 ? " отрицательных" : " отрицательнoe";
        System.out.println("Среди трех чисел: " + a + " " + b + " " + c + " ---> " + negCount + numNegCheck);
    }
}

class Task6 {

    public static void main(String[] args) {

        int a = 10;
        int b = 33;

        int c = a > b ? a : a < b ? b : 0;

        System.out.println(a + ":" + b + " ---> " + c);
    }
}

class Task7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int progNum;
        String prog_st = " программист";
        String prog_sta = " программистa";
        String prog_stov = " программистов";

        do {

            System.out.println("Enter some number:  ");
            progNum = in.nextInt();

            if ((progNum % 100 >= 5 && progNum % 100 <= 20) || progNum % 100 == 0) {
                System.out.println(progNum + prog_stov);
            } else
            if (progNum % 100 == 1) {
                System.out.println(progNum + prog_st);
            } else
            if (progNum % 100 >= 2 && progNum % 100 <= 4) {
                System.out.println(progNum + prog_sta);
            } else {
                if (progNum % 10 == 1) {
                    System.out.println(progNum + prog_st);
                } else
                if (progNum % 10 >= 2 && progNum % 10 <= 4) {
                    System.out.println(progNum + prog_sta);
                } else {
                    System.out.println(progNum + prog_stov);
                }
            }
        } while(progNum >= 0);
    }
}
