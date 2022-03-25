package com.company.lesson34;

import java.util.Scanner;

public class TicTacToe {
        public static void main(String[] args) {


                String[][] matrix = {
                                        { " ", " ", " "},
                                        { " ", " ", " "},
                                        { " ", " ", " "}
                                    };

                DisplayMatrix(matrix);

                int     gameState = 0;
                boolean player;

                for(int i = 0; i < 9; i++) {

                        player = (i & 1) == 0;

                        if(player) {
                                System.out.print("x: ");
                        } else {
                                System.out.print("O: ");
                        }
                        makeMove(matrix, player);
                        DisplayMatrix(matrix);

                        gameState = checkWinner(matrix);
                        if(gameState == 1) {

                                System.out.println("\nX - WINS!!!!");
                                break;

                        } else if(gameState == -1){

                                System.out.println("\nO - WINS!!!!");
                                break;
                        }
                }

                if(gameState == 0) {
                        System.out.println("\nDRAW!!!!!!!!!!");
                }

        }

        public static int checkWinner(String[][] matrix) {

                if((matrix[0][0].equals("x") && matrix[1][1].equals("x") && matrix[2][2].equals("x"))
                || (matrix[0][2].equals("x") && matrix[1][1].equals("x") && matrix[2][0].equals("x"))
                || (matrix[0][0].equals("x") && matrix[1][0].equals("x") && matrix[2][0].equals("x"))
                || (matrix[0][1].equals("x") && matrix[1][1].equals("x") && matrix[2][1].equals("x"))
                || (matrix[0][2].equals("x") && matrix[1][2].equals("x") && matrix[2][2].equals("x"))
                || (matrix[0][0].equals("x") && matrix[0][1].equals("x") && matrix[0][2].equals("x"))
                || (matrix[1][0].equals("x") && matrix[1][1].equals("x") && matrix[1][2].equals("x"))
                || (matrix[2][0].equals("x") && matrix[2][1].equals("x") && matrix[2][2].equals("x"))) {

                        return 1;

                } else if( (matrix[0][0].equals("O") && matrix[1][1].equals("O") && matrix[2][2].equals("O"))
                        || (matrix[0][2].equals("O") && matrix[1][1].equals("O") && matrix[2][0].equals("O"))
                        || (matrix[0][0].equals("O") && matrix[1][0].equals("O") && matrix[2][0].equals("O"))
                        || (matrix[0][1].equals("O") && matrix[1][1].equals("O") && matrix[2][1].equals("O"))
                        || (matrix[0][2].equals("O") && matrix[1][2].equals("O") && matrix[2][2].equals("O"))
                        || (matrix[0][0].equals("O") && matrix[0][1].equals("O") && matrix[0][2].equals("O"))
                        || (matrix[1][0].equals("O") && matrix[1][1].equals("O") && matrix[1][2].equals("O"))
                        || (matrix[2][0].equals("O") && matrix[2][1].equals("O") && matrix[2][2].equals("O"))) {

                        return -1;
                }

                return 0;
        }

        public static void makeMove(String[][] matrix, boolean player) {

                int row;
                int column;

                while (true) {
                        row = getCoordinate("row");
                        column = getCoordinate("column");

                        if (!matrix[row][column].equals(" ")) {
                                System.out.println("This coordinate is already full!");
                                continue;
                        }

                        break;
                }
                matrix[row][column] = (player) ? "x" : "O";
        }

        public static int getCoordinate(String is) {

                Scanner in = new Scanner(System.in);

                int value;

                boolean isGoodInput;
                while(true) {

                        System.out.print("Enter " + is + " [0..2]: ");
                        isGoodInput = in.hasNextInt();

                        if (isGoodInput) {
                                value = in.nextInt();
                                if ( (value < 0) || (value > 2) ) {
                                        continue;
                                }

                                break;

                        } else {
                                in.next();
                        }
                }

                return value;
        }

        public static void DisplayMatrix(String[][] matrix) {

                System.out.print(   "\n\t-------------------------"
                                  + "\n\t|\t" + matrix[0][0] + "\t|\t" + matrix[0][1] + "\t|\t" + matrix[0][2] + "\t|"
                                  + "\n\t-------------------------"
                                  + "\n\t|\t" + matrix[1][0] + "\t|\t" + matrix[1][1] + "\t|\t" + matrix[1][2] + "\t|"
                                  + "\n\t-------------------------"
                                  + "\n\t|\t" + matrix[2][0] + "\t|\t" + matrix[2][1] + "\t|\t" + matrix[2][2] + "\t|"
                                  + "\n\t-------------------------\n");
        }
}
