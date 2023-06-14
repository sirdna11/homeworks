package io.codelex.test.test3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoinerTest {

    @Test
    public void testJoiningIntegersWithSeparator() {
        Joiner<Integer> integerJoiner = new Joiner<>("-");

        String joined = integerJoiner.join(1, 2, 3, 4);
        assertEquals("1-2-3-4", joined);
    }

    @Test
    public void testJoiningStrings() {
        Joiner<String> stringJoiner = new Joiner<>(", ");

        String joined = stringJoiner.join("Hello", "World");
        assertEquals("Hello, World", joined);
    }
}