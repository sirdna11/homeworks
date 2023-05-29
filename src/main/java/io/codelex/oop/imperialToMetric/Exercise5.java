package io.codelex.oop.imperialToMetric;

public class Exercise5 {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();

        System.out.println("10 meters is equal to " + converter.convert(10, ConversionType.METERS_TO_YARDS) + " yards");
        System.out.println("20 yards is equal to " + converter.convert(20, ConversionType.YARDS_TO_METERS) + " meters");
        System.out.println("30 centimeters is equal to " + converter.convert(30, ConversionType.CENTIMETERS_TO_INCHES) + " inches");
        System.out.println("40 inches is equal to " + converter.convert(40, ConversionType.INCHES_TO_CENTIMETERS) + " centimeters");
        System.out.println("50 kilometers is equal to " + converter.convert(50, ConversionType.KILOMETERS_TO_MILES) + " miles");
        System.out.println("60 miles is equal to " + converter.convert(60, ConversionType.MILES_TO_KILOMETERS) + " kilometers");
    }
}
