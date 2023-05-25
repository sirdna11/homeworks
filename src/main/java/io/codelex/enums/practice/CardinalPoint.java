package io.codelex.enums.practice;

public enum CardinalPoint {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String direction;

    CardinalPoint(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}