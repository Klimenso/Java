package com.company.lesson11;

public class Main {

        public static void main(String[] args) {

                Car c1 = new Car();
                Car c2 = new Car();
                Car c3 = new Car();

                try {

                        System.out.println("Start car1");
                        c1.carStarting();
                        System.out.println("Start car2");
                        c2.carStarting();
                        System.out.println("Start car3");
                        c3.carStarting();

                } catch (CarStartingException e) {

                        System.out.println("Exception!");
                        System.out.println( (new StringBuilder().append(e.getValue()).append(" ").append(e.getMessage()).toString()) );
                }
        }
}