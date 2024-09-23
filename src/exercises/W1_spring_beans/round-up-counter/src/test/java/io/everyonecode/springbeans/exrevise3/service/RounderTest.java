package io.everyonecode.springbeans.exrevise3.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RounderTest {

    @Autowired
    Rounder rounder;

    @Test
    void roundUp() {
        assertEquals(5, rounder.roundUp(4.4));
    }

    @Test
    void roundDown() {
        assertEquals(4, rounder.roundDown(4.4));
    }
}