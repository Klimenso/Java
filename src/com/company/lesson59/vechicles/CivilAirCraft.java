package com.company.lesson59.vechicles;

public class CivilAirCraft extends AirCraft {

        private int passangersNum;
        private boolean businessClassAvail;

        public CivilAirCraft() {
                super();
        }

        public CivilAirCraft(double wingSpan, double runWayLength) {
                super(wingSpan, runWayLength);
        }

        public CivilAirCraft(int horsePower, double maxSpeed, double weight,
                             String carMake, double wingSpan, double runWayLength) {
                super(horsePower, maxSpeed, weight, carMake, wingSpan, runWayLength);
        }

        public int getPassangersNum() {
                return passangersNum;
        }

        public void setPassangersNum(int passangersNum) {
                this.passangersNum = passangersNum;
        }

        public boolean isBusinessClassAvail() {
                return businessClassAvail;
        }

        public void setBusinessClassAvail(boolean businessClassAvail) {
                this.businessClassAvail = businessClassAvail;
        }
}
