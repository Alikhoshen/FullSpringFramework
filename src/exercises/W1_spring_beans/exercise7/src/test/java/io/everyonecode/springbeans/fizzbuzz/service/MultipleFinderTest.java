package io.everyonecode.springbeans.fizzbuzz.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleFinderTest {

    MultipleFinder multipleFinder = new MultipleFinder(4);

    @Test
    void isMultiple() {
        assertEquals(true, multipleFinder.isMultiple(12));

    }
}