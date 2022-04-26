package com.company.lesson59.animals;

public abstract class Animal implements Veterinarian {

        private String food;
        private String location;

        public Animal(){
        }

        public Animal(String food, String location) {
                this.food = food;
                this.location = location;
        }

        public String getFood() { return food; }

        public void setFood(String food) {
                this.food = food;
        }

        public String getLocation() {
                return location;
        }

        public void setLocation(String location) {
                this.location = location;
        }

        public abstract void makeNoise();
        public abstract void eat();

        public void sleep() { System.out.println("Животное спит"); }

        @Override public void treatAnimal() { System.out.println("Food of Animal " + food
                + "\nLocation of Animal " + location); }

}
