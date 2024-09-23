package io.everyonecode.springbeans.exercise2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AmazingHelloWorldTest {

    @Autowired
    AmazingHelloWorld amazingHelloWorld;

    @Test
    void get() {
        assertEquals("Hello World", amazingHelloWorld.get());
    }
}