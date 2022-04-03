package com.company.lesson58.diff_tasks;

public class Rectangle extends Shape {

        private int x;
        private int y;

        public Rectangle() {

        }

        public Rectangle(String color, int x, int y) {
               super(color);
               this.x = x;
               this.y = y;
        }

        @Override
        public void draw() {
                System.out.println("Rectangle" + "\nx: " + this.x + "\ny: " + this.y + "\nColor: " + this.getColor());
        }
}
