package io.codelex.oop.summary.generics;

public class Combiner {

    public static <T, U> String combineTwoItems(T first, U second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }
}
