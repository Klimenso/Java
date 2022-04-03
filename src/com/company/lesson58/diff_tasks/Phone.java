package com.company.lesson58.diff_tasks;

public class Phone {

        private String number;
        private String model;
        private double weight;

        public void DisplayInfo() {
                System.out.println("Number: " + number + "\nModel: " + model + "\nWeight: " + weight);
        }

        public String getNumber() {
                return this.number;
        }

        public void receiveCall(String callerName) {
                System.out.println("Calls: " + callerName);
        }

        public Phone() {
                number = "+xxx_xx_xxx_xxxx";
                model = "some interesting model";
                weight = 120;
        }

        public Phone(String number, String model, int weight) {
                this.number = number;
                this.model = model;
                this.weight = weight;
        }

        public Phone(String number, String model) {
                this.number = number;
                this.model = model;
        }

        public void receiveCall(String callerName, String callerPhone) {
                System.out.println("Call: " + callerName  + "\ncallerPhone: " + callerPhone);
        }

        public void sendMessage(String message, String ... number) {
                System.out.println("send \"" + message + "\" to:");
                for(String i : number) {
                        System.out.println("\t" + i);
                }
        }
}
