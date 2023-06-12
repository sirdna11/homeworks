package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class CombinerTest {

    @Test
    public void shouldCombineTwoItems() {
        String combined = Combiner.combineTwoItems(5, "Hello");
        assertEquals("First item: 5; Second item: Hello", combined);

        combined = Combiner.combineTwoItems("Test", 3.14);
        assertEquals("First item: Test; Second item: 3.14", combined);
    }
}
