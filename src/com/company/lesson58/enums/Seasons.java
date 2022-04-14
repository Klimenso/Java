package com.company.lesson58.enums;

public enum Seasons {

        WINTER(-10),
        SPRING(5),
        SUMMER(20) {

                @Override public String getDescription() {
                        return "Теплое время года";
                }
        },
        AUTUMN(-1),
        DEFAULTSEAS() {

                @Override public String getDescription() {
                        return "Neither cold nor warm";
                }
        };

        private double averageTemperature;

        Seasons(double averageTemperature) {
                this.averageTemperature = averageTemperature;
        }

        Seasons() {
                this.averageTemperature = 0;
        }

        public String getDescription() {
                return "Холодное время года";
        }

        public double getAverageTemperature() {
                return this.averageTemperature;
        }
}
