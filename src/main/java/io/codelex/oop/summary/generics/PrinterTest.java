package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    @Test
    public void shouldPrintAnyObject() {
        Printer<Integer> intPrinter = new Printer<>(5);
        assertEquals(5, intPrinter.getThingToPrint());

        Printer<String> stringPrinter = new Printer<>("Hello");
        assertEquals("Hello", stringPrinter.getThingToPrint());
    }
}
