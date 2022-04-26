package com.company.lesson59;

import com.company.lesson59.enums.*;

public class Main {

        public static void main(String[] args) {

                Seasons favoriteSeason = Seasons.SUMMER;

                Seasons seasons[] = Seasons.values();

                for(Seasons s : seasons) {

                        System.out.println("Name : " + s.name() + "\nOrdinal : " + s.ordinal()
                                          + "\nFav : " + iLikeSeason(s)
                                          + "\nDescription : " + s.getDescription()
                                          + "\nAverageTemp : " + s.getAverageTemperature() );

                        System.out.println("----------------------------");

                }

                Clothes[] clothes = new Clothes[] {

                        new Tie(ClothingSize.M, 200.0, "WHITE"),
                        new Tshirt(ClothingSize.L, 250.0, "YELLOW"),
                        new Pants(ClothingSize.S, 17.0, "RED"),
                        new Skirt(ClothingSize.XXS, 215.0, "BLACK")
                };

                System.out.println("============MAN==============");
                Atelier.dressingMan(clothes);
                System.out.println("============WOMAN==============");
                Atelier.dressingWoman(clothes);
        }

        public static String iLikeSeason(Seasons s) {

                String out;

                switch(s) {
                        case AUTUMN :
                        case SPRING :
                        case SUMMER :
                        case WINTER :
                                out = "I like " + s.name();
                                break;
                        default:
                                out = "I don't like anyone";
                }

                return out;
        }
}
