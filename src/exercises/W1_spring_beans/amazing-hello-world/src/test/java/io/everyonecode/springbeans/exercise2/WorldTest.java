package io.everyonecode.springbeans.exercise2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class WorldTest {

    @Autowired
    World world;

    @Test
    void getWorld() {
        assertEquals("World", world.get());
    }
}