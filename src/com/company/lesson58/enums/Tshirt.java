package com.company.lesson58.enums;

public class Tshirt extends Clothes {

        public Tshirt(ClothingSize size, double price, String color) {
                super(size, price, color);
        }

        @Override
        public void dressMan() {

                System.out.println(this.toString());
                System.out.println(this.getSize());
                System.out.println(this.getColor());
                System.out.println(this.getPrice());
        }

        @Override
        public void dressWoman() {

                System.out.println(this.toString());
                System.out.println(this.getSize());
                System.out.println(this.getColor());
                System.out.println(this.getPrice());
        }
}
