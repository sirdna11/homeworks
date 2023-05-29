package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(300, 360),
    INTERMEDIATE(180, 299),
    ADVANCED(120, 179);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        for (Runner runner : values()) {
            if (time >= runner.minTime && time <= runner.maxTime) {
                return runner;
            }
        }
        throw new IllegalArgumentException("Invalid time provided");
    }
}