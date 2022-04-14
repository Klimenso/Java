package com.company.lesson58.enums;

import javax.annotation.processing.Messager;

public abstract class Clothes implements MensClothing, WomensClothing {

        protected ClothingSize size;
        protected double price;
        protected String color;

        public String getSize() {
                return size.getDescription();
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public Clothes(ClothingSize size, double price, String color) {
                this.size = size;
                this.price = price;
                this.color = color;
        }
}
