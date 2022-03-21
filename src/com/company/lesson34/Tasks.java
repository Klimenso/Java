package com.company.lesson34;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        // Task1
        //task1();

        // Task2
        //task2();

        // Task3
        //task3();

        // Task4
        //task4();

        // Task5
        //task5();

            //Task6
            //task6();

            //Task7
            //task7();

            //Task8
            //task8();

            //Task9
            //task9();

            //Task10
            //task10();
    }

    public static void task1() {

        int[] evenArray = new int[10];
        int evenNum = 2;

        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = evenNum;
            evenNum += 2;
        }

        for (int value : evenArray) {
            System.out.print(value + " ");
        }

        System.out.println();

        for (int value : evenArray) {
            System.out.println(value);
        }
    }

    public static void task2() {

        final int ARRAY_SIZE = 50;

        int[] oddArray = new int[ARRAY_SIZE];
        int oddNum = 1;

        for(int i = 0; i < oddArray.length; i++) {
            oddArray[i] = oddNum;
            oddNum += 2;
        }

        for (int value : oddArray) {
            System.out.print(value + " ");
        }

        System.out.println();

        for(int i = oddArray.length - 1; i >= 0; i--) {
            System.out.print(oddArray[i] + " ");
        }
    }

    public static void task3() {

        Random randNum = new Random();
        final int ARRAY_SIZE = 15;
        final int BOUND      = 99;

        int[] array = new int[ARRAY_SIZE];

        for(int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(BOUND);
        }

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();

        int evenNum = 0;

        for(int value : array) {
            if( (value & 1) == 0) {
                evenNum++;
                System.out.print(value + " ");
            }
        }

        System.out.println("\neven --> " + evenNum);
    }

    public static void task4() {

        Random randNum = new Random();
        final int ARRAY_SIZE = 20;
        final int BOUND      = 20;

        int[] array = new int[ARRAY_SIZE];

        for(int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(BOUND);
        }

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();

        for(int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        for(int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void task5() {

        Random randNum = new Random();
        final int ARRAY_SIZE = 5;
        final int BOUND      = 15;

        int[] array1 = new int[ARRAY_SIZE];
        int[] array2 = new int[ARRAY_SIZE];

        for(int i = 0; i < array1.length; i++) {
            array1[i] = randNum.nextInt(BOUND);
        }

        for(int i = 0; i < array2.length; i++) {
            array2[i] = randNum.nextInt(BOUND);
        }

        System.out.print("[1]: ");
        for (int value : array1) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.print("[2]: ");
        for (int value : array2) {
            System.out.print(value + " ");
        }

        System.out.println();

        int average1 = 0;       int average2 = 0;

        for(int i = 0; i < array1.length; i++) {
            average1 += array1[i];
            average2 += array2[i];
        }
        System.out.println("[1]: " + average1);
        System.out.println("[2]: " + average2);
        System.out.println( (average1 > average2)
                ? (average1 + " more")
                : (average1 < average2)
                        ? (average2 + " more")
                        : (average1 + " " + average2 + "Equals") );
    }

    public static void task6() {

            Random random = new Random();

            final int ARRAY_SIZE = 4;
            final int BOUND      = 10;

            int[] array = new int[ARRAY_SIZE];

                   for(int i = 0; i < array.length; i++) {
                           array[i] = random.nextInt(BOUND);
                   }

                    for (int value : array) {
                            System.out.print(value + " ");
                    }

                    boolean isStrictIncrease = true;
                    for(int i = 0; i < array.length - 1; i++) {
                            if (array[i + 1] <= array[i]) {
                                    isStrictIncrease = false;
                                    break;
                            }
                    }

                    if(array[array.length - 1] <= array[array.length - 2]) {
                            isStrictIncrease = false;
                    }

                    if(isStrictIncrease) {
                            System.out.println("\narray is strictly increasing");
                    } else {
                            System.out.println("\narray isn't strictly increasing");
                    }
    }

    public static void task7() {

            Random random = new Random();
            final int ARRAY_SIZE = 12;
            final int BOUND      = 15;

            int[] array = new int[ARRAY_SIZE];

            for(int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(BOUND);
            }

            for (int value : array) {
                    System.out.print(value + " ");
            }

            int max      = array[0];
            int maxIndex = 0;

            for(int i = 1; i < array.length; i++) {
                    if(array[i] > max) {
                            maxIndex = i;
                    }
            }

            System.out.println("\nmax elem: " + array[maxIndex]
                                + "\nindex: " + maxIndex);
    }

    public static void task8() {

            Random randNum = new Random();
            final int ARRAY_SIZE = 10;
            final int BOUND      = 9;

            int[] array1 = new int[ARRAY_SIZE];
            int[] array2 = new int[ARRAY_SIZE];

                double[] dArray = new double[ARRAY_SIZE];

            for(int i = 0; i < array1.length; i++) {
                    array1[i] = randNum.nextInt(BOUND);
            }

            for(int i = 0; i < array2.length; i++) {
                    array2[i] = randNum.nextInt(BOUND);
            }

            System.out.print("[1]: ");
            for (int value : array1) {
                    System.out.print(value + " ");
            }

            System.out.println();

            System.out.print("[2]: ");
            for (int value : array2) {
                    System.out.print(value + " ");
            }

            System.out.println();

            for(int i = 0; i < array1.length; i++) {
                    dArray[i] = (double) array1[i] / array2[i];
            }

            System.out.print("[3]: ");
            for (double value : dArray) {
                    System.out.printf("%.2f | ", value);
            }

            System.out.print("\nInteger: ");

            for(double value : dArray) {
                    if(value % 1 == 0) {
                            System.out.printf("%.2f ", value);
                    }
            }
    }

    public static void task9()  {

            Scanner in = new Scanner(System.in);
            final int BOUND = 15;
            int size;

            boolean isGoodInput;
            while(true) {

                    System.out.print("Enter positive int value: ");
                    isGoodInput = in.hasNextInt();

                    if (isGoodInput) {
                            size = in.nextInt();
                            if (size < 1) {
                                    continue;
                            }

                            break;

                    } else {
                            in.next();
                    }
            }

            Random random = new Random();
            int[] array = new int[size];

            for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(BOUND);
            }

            for (int value : array) {
                    System.out.print(value + " ");
            }

            int left = array.length / 2;
            int leftSum =  0;
            int rightSum = 0;

            for (int i = 0; i < left; i++) {
                    leftSum += array[i];
            }

            for (int i = left; i < array.length; i++) {
                    rightSum += array[i];
            }

            System.out.println("\n[1]: " + leftSum);
            System.out.println("[2]: " + rightSum);
            System.out.println( (leftSum > rightSum)
                    ? (leftSum + " more")
                    : (leftSum < rightSum)
                    ? (rightSum + " more")
                    : (leftSum + " " + rightSum + " Equals") );
    }

    public static void task10() {

            Scanner in = new Scanner(System.in);
            int bound;
            int size;

            boolean isGoodInput;
            while(true) {

                    System.out.print("Enter positive int value > 3: ");
                    isGoodInput = in.hasNextInt();

                    if (isGoodInput) {
                            bound = size = in.nextInt();
                            if (size < 4) {
                                    continue;
                            }

                            break;

                    } else {
                            in.next();
                    }
            }

            Random random = new Random();
            int[] array = new int[size];

            for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(bound);
            }

            for (int value : array) {
                    System.out.print(value + " ");
            }

            int evenCount = 0;
            for (int value : array) {
                    if ( (value & 1) == 0 ) {
                            evenCount++;
                    }
            }

            int[] evenArray = new int[evenCount];
            int i = 0;

            for(int value : array) {
                    if ( (value & 1) == 0 ) {
                            evenArray[i] = value;
                            i++;
                    }
            }

            System.out.println();
            for(int value : evenArray) {
                    System.out.print(value + " ");
            }
    }
}