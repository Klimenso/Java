package com.company.lesson59.enums;

public class Tie extends Clothes {

        public Tie(ClothingSize size, double price, String color) {
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

        }
}
