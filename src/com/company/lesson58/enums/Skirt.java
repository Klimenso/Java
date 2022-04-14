package com.company.lesson58.enums;

public class Skirt extends Clothes {

        public Skirt(ClothingSize size, double price, String color) {
                super(size, price, color);
        }

        @Override
        public void dressWoman() {

                System.out.println(this.toString());
                System.out.println(this.getSize());
                System.out.println(this.getColor());
                System.out.println(this.getPrice());
        }

        @Override
        public void dressMan() {

        }
}
