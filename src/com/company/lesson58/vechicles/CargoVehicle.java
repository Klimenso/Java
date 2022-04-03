package com.company.lesson58.vechicles;

public class CargoVehicle extends GroundVehicle {

        private double loadCapacity;

        public CargoVehicle() {
                super();
        }

        public CargoVehicle(double loadCapacity) {
                this.loadCapacity = loadCapacity;
        }

        public CargoVehicle(int wheelsNum, double fuelConsume, double loadCapacity) {
                super(wheelsNum, fuelConsume);
                this.loadCapacity = loadCapacity;
        }

        public CargoVehicle(int horsePower, double maxSpeed, double weight,
                            String carMake, int wheelsNum, double fuelConsume, double loadCapacity) {
                super(horsePower, maxSpeed, weight, carMake, wheelsNum, fuelConsume);
                this.loadCapacity = loadCapacity;
        }

        public double getLoadCapacity() {
                return loadCapacity;
        }

        public void setLoadCapacity(double loadCapacity) {
                this.loadCapacity = loadCapacity;
        }
}
