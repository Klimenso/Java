package com.company.lesson59.animals;

public class Cat extends Animal {

        private double catHairLength;
        private String breed;

        public Cat(){

        }

        public Cat(String food, String location, double catHairLength, String breed) {
                super(food, location);
                this.catHairLength = catHairLength;
                this.breed = breed;
        }

        public double getCatHairLength() {
                return catHairLength;
        }

        public void setCatHairLength(double catHairLength) {
                this.catHairLength = catHairLength;
        }

        public String getBreed() {
                return breed;
        }

        public void setBreed(String breed) {
                this.breed = breed;
        }

        @Override public void treatAnimal() {
                System.out.println("Cat");
                super.treatAnimal();
        }

        @Override
        public void makeNoise() { System.out.println("Mяу-Мяу"); }

        @Override
        public void eat() { System.out.println("Cat eats fish and cat food: " + getFood()); }
}
