package com.company.lesson34;

import java.util.Random;

public class AddTasks {
        public static void main(String[] args) {

                Random random = new Random();
                final int SIZE = 15;
                final int BOUND = 10;

                int[] array = new int[SIZE];
                for (int i = 0; i < array.length; i++) {
                        array[i] = random.nextInt(BOUND) + 1;
                }

                System.out.print("|");
                for (int value : array) {
                        System.out.print(value + "|");
                }

                //addTask1
                //addTask1(array);

                //addTask2
                //addTask2(array);

                //addTask3
                //addTask3(array);

                //addTask4
                //addTask4(array);

                //addTask5
                //addTask5(array);

                //addTask6
                //addTask6(array);

                //addTask7
                //addTask7(array, 11);

                //addTask8
                //addTask8(array);
        }

        public static void addTask1(int[] array) {

               int sum = 0;
               for (int value : array) {
                      if (value % 3 == 0) {
                              sum += value;
                      }
               }
               System.out.println("\nSum multiple of three: " + sum);
        }

        public static void addTask2(int[] array) {

                int average = 0;
                for (int i = 1; i < array.length; i+= 2) {
                       average += array[i];
                }
                System.out.println("\nAverage: " + average);
        }

        public static void addTask3(int[] array) {
                int term = 5;
                int average  = 0;

                for (int value : array) {
                        if(value > term) {
                                average += value;
                        }
                }
                System.out.print("\nAverage more than " + term + ": " + average);
        }

        public static void addTask4(int[] array) {

                int minOddValue = array[1];
                for (int value : array) {
                        if ( ( (value & 1) == 1) && (minOddValue > value) ) {
                                minOddValue = value;
                        }
                }
                System.out.print("\nMin odd value: " + minOddValue);
        }

        public static void addTask5(int[] array) {

                for (int i = 1; i < array.length; i++) {
                        if ( (i & 1) == 0 ) {
                                array[i / 2] = array[i];
                        }
                        if (i > array.length / 2) {
                                array[i] = 0;
                        }
                }

                System.out.print("\n|");
                for(int value : array) {
                        System.out.print(value + "|");
                }
        }

        public static void addTask6(int[] array) {

                boolean allDiff = true;
                for(int j = 0; j < array.length - 1; j++) {
                        for (int i = j + 1; i < array.length; i++) {
                                if (array[i] == array[j]) {
                                        allDiff = false;
                                        break;
                                }
                        }
                }

                if(allDiff) {
                        System.out.print("\nAll diff");
                } else {
                        System.out.print("\nThere are the same");
                }
        }

        public static void addTask7(int[] array, int elem) {

                int count = 0;
                int e = elem;
                for(int i = 0; i < array.length; i++) {
                        if(array[i] == e) {
                                count++;
                        }
                }

                System.out.println("\nElem: " + e + " ---> " + count + " times");
        }

        public static void addTask8(int[] array) {

                int max        = 0;
                int second_max = 0;
                for(int i = 1; i < array.length; i++) {
                        if(array[i] > max) {
                                second_max = max;
                                max = array[i];
                        } else if(array[i] > second_max && array[i] != max) {
                                second_max = array[i];
                        }
                }
                System.out.print("\nSecond max " + second_max);
        }
}
