package io.codelex.test.test3;

public class Main {
    public static void main(String[] args) {
        Joiner<Integer> integerJoiner = new Joiner<>("-");

        System.out.println(integerJoiner.join(1, 2, 3, 4));

        Joiner<String> stringJoiner = new Joiner<>("---------------");

        System.out.println(stringJoiner.join("Andruhs", "king"));
    }
}
