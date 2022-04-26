package com.company.lesson59.vechicles;

public class PassangerVehicle extends GroundVehicle {

        private String bodyType;
        private int passagesNumb;

        public PassangerVehicle() {
                super();
        }

        public PassangerVehicle(String bodyType, int passangersNum) {
                this.bodyType = bodyType;
                this.passagesNumb = passangersNum;
        }

        public PassangerVehicle(int wheelsNum, double fuelConsume, String bodyType, int passagesNumb) {
                super(wheelsNum, fuelConsume);
                this.bodyType = bodyType;
                this.passagesNumb = passagesNumb;
        }

        public PassangerVehicle(int horsePower, double maxSpeed, double weight,
                                String carMake, int wheelsNum, double fuelConsume, String bodyType, int passagesNumb) {

                super(horsePower, maxSpeed, weight, carMake, wheelsNum, fuelConsume);
                this.bodyType = bodyType;
                this.passagesNumb = passagesNumb;
        }

        public String getBodyType() {
                return bodyType;
        }

        public void setBodyType(String bodyType) {
                this.bodyType = bodyType;
        }

        public int getPassagesNumb() {
                return passagesNumb;
        }

        public void setPassagesNumb(int passagesNumb) {
                this.passagesNumb = passagesNumb;
        }
}
