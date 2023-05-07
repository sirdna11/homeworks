package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        BigDecimal pi = BigDecimal.valueOf(Math.PI);
        BigDecimal squareOfRadius = radius.multiply(radius);
        BigDecimal area = pi.multiply(squareOfRadius);
        return area.doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        BigDecimal area = length.multiply(width);
        return area.doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal height) {

        BigDecimal two = BigDecimal.valueOf(2);
        BigDecimal area = base.multiply(height).divide(two);

        return area.doubleValue();

    }
}
