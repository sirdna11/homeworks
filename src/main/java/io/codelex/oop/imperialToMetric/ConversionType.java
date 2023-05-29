package io.codelex.oop.imperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS(value -> value * 1.09361),
    YARDS_TO_METERS(value -> value * 0.9144),
    CENTIMETERS_TO_INCHES(value -> value * 0.393701),
    INCHES_TO_CENTIMETERS(value -> value * 2.54),
    KILOMETERS_TO_MILES(value -> value * 0.621371),
    MILES_TO_KILOMETERS(value -> value * 1.60934);

    private final Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return this.converter;
    }
}
