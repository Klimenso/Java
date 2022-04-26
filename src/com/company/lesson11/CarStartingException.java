package com.company.lesson11;

public class CarStartingException extends Exception {

        private int value;

        CarStartingException(String message, int value) {

                super(message);
                this.value = value;

        }

        public int getValue() { return this.value; }
}
