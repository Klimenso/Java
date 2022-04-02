package com.company.lesson58;

public class Main {

        public static void main(String[] args) {

                Shape aCircle1 = new Circle("Red", 1, 2);
                Shape aCircle2 = new Circle("Yellow", 5, 10);
                Shape aRectangle1 = new Rectangle("Black", 2, 3);
                Shape aRectangle2 = new Rectangle("White", 11, 9);



                Shape[] shapes = {aCircle1, aCircle2, aRectangle1, aRectangle2};

                for(Shape i : shapes) {
                        i.draw();
                }

        }
}
