package com.company.lesson59.animals;

public class Dog extends Animal {

        private String owner;
        private String breed;
        private boolean isTrain;

        public Dog() {

        }

        public Dog(String food, String location, String owner, String breed, boolean isTrain) {
                super(food, location);
                this.owner = owner;
                this.breed = breed;
                this.isTrain = isTrain;
        }

        @Override public void treatAnimal() {
                System.out.println("Dog");
                super.treatAnimal();
        }

        @Override public void makeNoise() { System.out.println("Гав-Гав"); }

        @Override public void eat() { System.out.println("Dog eats bones and dog food: " + getFood()); }

        public String getOwner() { return owner; }

        public void setOwner(String owner) { this.owner = owner; }

        public String getBreed() { return breed; }

        public void setBreed(String breed) { this.breed = breed; }

        public boolean isTrain() { return isTrain; }

        public void setTrain(boolean train) { isTrain = train; }
}
