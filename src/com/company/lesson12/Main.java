package com.company.lesson12;

import com.company.lesson11.Car;

import java.io.IOException;

public class Main {

        public static void main(String[]args) {


                try {

                        Car newCar = (Car)SerializeHandler.deserialize("serizlizeCar");
                        System.out.println(newCar);



                } catch (IOException | ClassNotFoundException e) {

                        e.getMessage();
                }



        }


}
