package io.everyonecode.springbeans.exrevise3.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UpDownIndicatorTest {

    @Autowired
    UpDownIndicator upDownIndicator;

    @Test
    void indicate() {
        assertEquals("Up", upDownIndicator.indicate(5.6));
        assertEquals("Down", upDownIndicator.indicate(-5.6));
        assertEquals("Same", upDownIndicator.indicate(5.5));
        assertEquals("Same", upDownIndicator.indicate(0));
    }
}