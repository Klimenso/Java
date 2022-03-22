package com.company.lesson34;

import java.util.Random;
import java.util.Scanner;

public class MatrixTasks {
        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                Random random = new Random();
                System.out.print("Enter matrix size: ");
                int n = in.nextInt();
                int[][] matrix = new int[n][n];

                for(int i = 0; i < matrix.length; i++) {
                        for(int j = 0; j < matrix[0].length; j++) {
                                matrix[i][j] = random.nextInt(50);
                        }
                }

                for(int[] i : matrix) {
                       for(int j : i) {
                               System.out.printf("%-5d", j);
                       }
                       System.out.println();
                }

                //matrixTask1
                //matrixTask1(matrix);

                //matrixTask2
                //matrixTask2(matrix);

                //matrixTask3
                //matrixTask3(matrix);

                //matrixTask4
                //matrixTask4(matrix);
        }

        public static void matrixTask1(int[][] matrix) {

                int sum = 0;
                for(int i = 0; i < matrix.length; i++) {
                        sum += matrix[i][i];
                }
                System.out.print("\nSum main diag: " + sum);
        }

        public static void matrixTask2(int[][] matrix) {

                System.out.println();
                for(int i = 0; i < matrix.length; i++) {
                        for(int j = 0; j  < matrix.length; j++) {
                                if(j < i) {
                                        System.out.print(matrix[i][j] + " ");
                                }
                        }
                }
        }

        public static void matrixTask3(int[][] matrix) {

                int sum = 0;
                for(int i = 0; i < matrix.length; i++) {
                        for(int j = 0; j  < matrix.length; j++) {
                                if( (j < matrix.length - 1 - i) && ( (matrix[i][j] & 1) == 0) ) {
                                        sum += matrix[i][j];
                                }
                        }
                }
                System.out.print("\nSum even high side diag: " + sum);
        }

        public static void matrixTask4(int[][] matrix) {

                int temp;
                for(int i = 0; i < matrix.length; i++) {
                        for(int j = i; j  < matrix.length; j++) {
                                temp = matrix[i][j];
                                matrix[i][j] = matrix[j][i];
                                matrix[j][i] = temp;
                        }
                }
        }
}
