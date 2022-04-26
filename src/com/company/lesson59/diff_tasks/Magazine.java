package com.company.lesson59.diff_tasks;

public class Magazine implements Printable {
        public void print() {
                System.out.println("Magazine");
        }

        public static void printMagazines(Printable[] printable) {
                for(Printable i : printable) {
                        if(i instanceof Magazine) {
                                System.out.println(i);
                        }
                }
        }
}
