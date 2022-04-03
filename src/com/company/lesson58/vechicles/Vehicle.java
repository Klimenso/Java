package com.company.lesson58.vechicles;

import javax.imageio.ImageReader;

public abstract class Vehicle {

        private int horsePower;
        private double maxSpeed;
        private double weight;
        private String carMake;

        public Vehicle() {
        }

        public Vehicle(int horsePower, double maxSpeed, double weight, String carMake) {

                this.horsePower = horsePower;
                this.maxSpeed = maxSpeed;
                this.weight = weight;
                this.carMake = carMake;
        }

        public int getHorsePower() {
                return horsePower;
        }

        public void setHorsePower(int horsePower) {
                this.horsePower = horsePower;
        }

        public double getMaxSpeed() {
                return maxSpeed;
        }

        public void setMaxSpeed(double maxSpeed) {
                this.maxSpeed = maxSpeed;
        }

        public double getWeight() {
                return weight;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }

        public String getCarMake() {
                return carMake;
        }

        public void setCarMake(String carMake) {
                this.carMake = carMake;
        }

        double horsePowerTokB(int horsePower) {
                return horsePower * 0.74;
        }
}
