package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StorageHouseTest {

    @Test
    public void shouldStoreAnyTypeOfObjects() {
        StorageHouse<Integer> intStorage = new StorageHouse<>(1);
        intStorage.addMoreItems(2);
        Optional<Integer> maybeFirstInt = intStorage.getMaybeFirstItem();

        assertTrue(maybeFirstInt.isPresent());
        assertEquals(1, maybeFirstInt.get());

        StorageHouse<String> stringStorage = new StorageHouse<>("Apple");
        stringStorage.addMoreItems("Orange");
        Optional<String> maybeFirstString = stringStorage.getMaybeFirstItem();

        assertTrue(maybeFirstString.isPresent());
        assertEquals("Apple", maybeFirstString.get());
    }
}
