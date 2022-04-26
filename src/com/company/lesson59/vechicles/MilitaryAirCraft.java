package com.company.lesson59.vechicles;

public class MilitaryAirCraft extends AirCraft {

        private boolean ejectionSystemAvail;
        private int missilesNum;

        public MilitaryAirCraft() {
                super();
        }

        public MilitaryAirCraft(boolean ejectionSystemAvail, int missilesNum) {
                this.ejectionSystemAvail = ejectionSystemAvail;
                this.missilesNum = missilesNum;
        }

        public MilitaryAirCraft(double wingSpan, double runWayLength, boolean ejectionSystemAvail, int missilesNum) {
                super(wingSpan, runWayLength);
                this.ejectionSystemAvail = ejectionSystemAvail;
                this.missilesNum = missilesNum;
        }

        public MilitaryAirCraft(int horsePower, double maxSpeed, double weight,
                                String carMake, double wingSpan, double runWayLength, boolean ejectionSystemAvail, int missilesNum) {
                super(horsePower, maxSpeed, weight, carMake, wingSpan, runWayLength);
                this.ejectionSystemAvail = ejectionSystemAvail;
                this.missilesNum = missilesNum;
        }

        public boolean isEjectionSystemAvail() {
                return ejectionSystemAvail;
        }

        public void setEjectionSystemAvail(boolean ejectionSystemAvail) {
                this.ejectionSystemAvail = ejectionSystemAvail;
        }

        public int getMissilesNum() {
                return missilesNum;
        }

        public void setMissilesNum(int missilesNum) {
                this.missilesNum = missilesNum;
        }
}
