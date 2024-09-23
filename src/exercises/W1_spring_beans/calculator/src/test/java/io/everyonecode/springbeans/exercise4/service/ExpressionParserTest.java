package io.everyonecode.springbeans.exercise4.service;

import io.everyonecode.springbeans.exercise4.model.Expression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ExpressionParserTest {

    @Autowired
    ExpressionParser expressionParser;

    @Test
    void parse() {
        Expression expressionResult = expressionParser.parse("1 + 2");
        Expression expected = new Expression("+", 1.0, 2.0) ;
        assertEquals(expected, expressionResult);
    }

}