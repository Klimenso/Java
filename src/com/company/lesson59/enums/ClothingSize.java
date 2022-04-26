package com.company.lesson59.enums;

public enum ClothingSize {

        XXS(32) {

                @Override public String getDescription() {
                        return "Детский размер";
                }
        },
        XS(34),
        S(36),
        M(38),
        L(40);

        private int size;

        ClothingSize(int size) {
                this.size = size;
        }

        public String getDescription() {
                return "Взрослый размер";
        }
}
