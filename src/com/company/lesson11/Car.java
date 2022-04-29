package com.company.lesson11;

import java.io.Serializable;
import java.util.Random;

public class Car implements Serializable {

        private String brand;
        private double speed;
        private double price;

        public Car() {
                super();
        }

        @Override
        public String toString() {
                return "Car{" +
                        "brand='" + brand + '\'' +
                        ", speed=" + speed +
                        ", price=" + price +
                        '}';
        }

        public Car(String brand, double speed, double price) {
                this.brand = brand;
                this.speed = speed;
                this.price = price;
        }

        public String getBrand() {
                return brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public double getSpeed() {
                return speed;
        }

        public void setSpeed(double speed) {
                this.speed = speed;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public void carStarting() throws CarStartingException {

                Random rand = new Random();
                int value = rand.nextInt(21);

                if( (value & 1) == 0) {
                        throw new CarStartingException("Can't drive exception!", value);
                }
        }
}
