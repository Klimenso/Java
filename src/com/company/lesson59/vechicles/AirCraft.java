package com.company.lesson59.vechicles;

public abstract class AirCraft extends Vehicle {

        private double wingSpan;
        private double runWayLength;


        public AirCraft() {
                super();
        }

        public AirCraft(double wingSpan, double runWayLength) {
                this.wingSpan = wingSpan;
                this.runWayLength = runWayLength;
        }

        public AirCraft(int horsePower, double maxSpeed, double weight,
                        String carMake, double wingSpan, double runWayLength) {

                super(horsePower, maxSpeed, weight, carMake);
                this.wingSpan = wingSpan;
                this.runWayLength = runWayLength;
        }

        public double getWingSpan() {
                return wingSpan;
        }

        public void setWingSpan(double wingSpan) {
                this.wingSpan = wingSpan;
        }

        public double getRunWayLength() {
                return runWayLength;
        }

        public void setRunWayLength(double runWayLength) {
                this.runWayLength = runWayLength;
        }
}
