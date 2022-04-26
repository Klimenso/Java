package com.company.lesson59.diff_tasks;

public class Aspirant extends Student {
        private String scienceWork;

        public Aspirant() {
                averageMark = (int) (Math.random() * 6);
        }
        @Override public double getScholarship() {
                return (this.averageMark == 5) ?  200 : 180;
        }
}
