package com.company.lesson1;

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

        int a = 11;
        String prog = "";

        if(a >= 10 &&  a < 21) {
            prog = " программистов";
        } else if ( a < 10 || a > 20){
            if (a % 10 == 1 ) {
                prog = " программист";
            }
            if (a % 10 > 1 && a % 10 < 5) {
                prog = " программистa";
            }
            if (a % 10 > 4 || a % 10 == 0) {
                prog = " программистов";
            }
        }
        System.out.println(a + prog);
    }
}
