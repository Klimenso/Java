package com.company.lesson58;

public class Circle extends Shape {

        private int x;
        private int y;

        public Circle() {

        }

        public Circle(String color, int x, int y) {
               super(color);
               this.x = x;
               this.y = y;
        }


        @Override
        public void draw() {
                System.out.println("Circle: " + "\nx: " + this.x + "\ny: " + this.y + "\nColor: " + this.getColor());
        }
}
