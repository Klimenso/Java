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

}
