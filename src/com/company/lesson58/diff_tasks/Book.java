package com.company.lesson58.diff_tasks;

public class Book implements Printable {

        public void print() {
                System.out.println("Book");
        }

        public static void printBooks(Printable[] printables) {
                for(Printable i : printables) {
                        if(i instanceof Book){
                                System.out.println(i);
                        }
                }
        }
}
