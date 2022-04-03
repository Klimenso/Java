package com.company.lesson58.diff_tasks;

public class Person {

        private String fullName;
        private int age;
        private static int counter;

        static {
                counter = 0;
        }

        public Person() {
                counter++;
                this.age = 18;
                this.fullName = "Unnamed Person";
        }

        public Person(String fullName, int age) {
                counter++;
                this.fullName = fullName;
                this.age = age;
        }

        public void setFullName(String fullName) {
                this.fullName = fullName;
        }

        public void setAge(int age) {

                if (age > 0 && age <= 100) {
                        this.age = age;
                } else {
                        System.out.println("set default age - 18");
                        this.age = 18;
                }
        }

        public int getAge() {
                return this.age;
        }

        public String getFullName() {
                return this.fullName;
        }

        public static void displayPersonCount() {
                System.out.println("Number of people: " + counter);
        }

        public void move() {
                 System.out.println("Person " + this.fullName + " идет.");
        }

        public void talk() {
                System.out.println("Person " + fullName + " говорит.");
        }
}
