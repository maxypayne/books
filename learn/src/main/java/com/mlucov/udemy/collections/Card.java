package com.mlucov.udemy.collections;

import java.util.HashMap;
import java.util.HashSet;

public record Card(Suit suit, String face, int rank) {
        public enum Suit {
            CLUB, DIAMOND, HEART, SPADE;
            public char getImage() {
                return (new char[]{9927, 9830, 9828, 9824}[this.ordinal()]);
            }
        }

    @Override
    public String toString() {
        HashSet
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }
}
