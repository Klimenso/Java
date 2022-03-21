package com.company.lesson34;

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
}