package io.everyonecode.springbeans.goodbyeworld.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class GoodbyeWorldTest {

    @Autowired
    GoodbyeWorld goodbyeWorld;

    @Test
    void get() {
        assertEquals("Goodbye World", goodbyeWorld.get());
    }
}