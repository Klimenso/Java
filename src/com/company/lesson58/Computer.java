package com.company.lesson58;

import java.util.Random;

public class Computer {

        private String CPU;
        private String RAM;
        private String hardDrive;
        private int resource;
        private static Random random;

        static {
                random = new Random();
        }

        public Computer() {
                this.CPU = "i3";
                this.RAM = "DDR3 - 16gb";
                this.hardDrive = "samsung - 1tb";
                this.resource = 5;
        }

        public void displayInfo() {

                if(resource == 0) {
                        System.out.println("Computer burned down");
                }
                System.out.println("cpu: " + CPU + "ram: " + RAM + "harddrive " + hardDrive + "resource " + resource);
        }

        private void burnDown() {
                this.displayInfo();
                System.out.println("This computer -----^ burned down(");
        }

        public void turnOn() {
                int isGood = 0;

                if(resource == 0) {
                        this.burnDown();
                } else {
                        if(isGood == 1) {
                                System.out.println("computer turned on");
                        } else if (isGood == 0) {
                                resource -= 1;
                                System.out.println("Could not turn on, resource -1");
                        }
                }
        }
        public void turnOff() {
                int isGood = 0;

                if(resource == 0) {
                        this.burnDown();
                } else {
                        if(isGood == 1) {
                                System.out.println("computer turned off");
                        } else if (isGood == 0) {
                                resource -= 1;
                                System.out.println("Could not turn off, resource -1");
                        }
                }
        }
}
