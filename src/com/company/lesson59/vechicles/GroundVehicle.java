package com.company.lesson59.vechicles;

public abstract class GroundVehicle extends Vehicle {

        private int wheelsNum;
        private double fuelConsume;

        public GroundVehicle() {
                super();
        }

        public GroundVehicle(int wheelsNum, double fuelConsume) {
                this.wheelsNum = wheelsNum;
                this.fuelConsume = fuelConsume;
        }

        public GroundVehicle(int horsePower, double maxSpeed, double weight,
                             String carMake, int wheelsNum, double fuelConsume) {

                super(horsePower, maxSpeed, weight, carMake);
                this.wheelsNum = wheelsNum;
                this.fuelConsume = fuelConsume;
        }

        public int getWheelsNum() {
                return wheelsNum;
        }

        public void setWheelsNum(int wheelsNum) {
                this.wheelsNum = wheelsNum;
        }

        public double getFuelConsume() {
                return fuelConsume;
        }

        public void setFuelConsume(double fuelConsume) {
                this.fuelConsume = fuelConsume;
        }
}
