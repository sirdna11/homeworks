package io.codelex.enums.practice;

public class Exercise1 {
    public static void main(String[] args) {
        for (CardinalPoint cardinalPoint : CardinalPoint.values()) {
            System.out.println(cardinalPoint + ":" + cardinalPoint.getDirection() + ":" + cardinalPoint.ordinal());
        }
    }
}
