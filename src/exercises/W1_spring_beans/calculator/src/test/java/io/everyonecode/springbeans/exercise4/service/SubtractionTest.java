package io.everyonecode.springbeans.exercise4.service;

import io.everyonecode.springbeans.exercise4.model.Expression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SubtractionTest {

    @Autowired
    Subtraction subtraction;

    @Test
    void calculate() {

        assertEquals(4, subtraction.calculate(new Expression("-", 4, 0)));

    }
}