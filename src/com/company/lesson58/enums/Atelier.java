package com.company.lesson58.enums;

public class Atelier {

        public static void dressingWoman(Clothes[] clothes) {

                for(Clothes c : clothes) {

                                c.dressWoman();
                }

        }

        public static void dressingMan(Clothes[] clothes) {

                for(Clothes c : clothes) {

                                c.dressMan();
                }
        }
}
