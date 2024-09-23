package io.everyonecode.springbeans.exercise4.service;

import io.everyonecode.springbeans.exercise4.model.Expression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MultiplicationTest {

    @Autowired
    Multiplication multiplication;



    @Test
    void calculate() {
        assertEquals(8, multiplication.calculate(new Expression("*", 2, 4)));
    }
}