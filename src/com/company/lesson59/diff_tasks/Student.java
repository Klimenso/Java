package com.company.lesson59.diff_tasks;

public class Student {
        private String firstName;
        private String lastName;
        private int group;
        protected int averageMark;

        public Student() {
                averageMark = (int) (Math.random() * 6);
        }


        public double getScholarship() {
                return (this.averageMark == 5) ?  100 : 80;
        }
}
