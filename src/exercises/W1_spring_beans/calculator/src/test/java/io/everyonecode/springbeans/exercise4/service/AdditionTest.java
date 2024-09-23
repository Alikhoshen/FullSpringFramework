package io.everyonecode.springbeans.exercise4.service;

import io.everyonecode.springbeans.exercise4.model.Expression;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AdditionTest {

    @Autowired
     private Calculation addition;

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(0.0, new Expression("+", 0, 0)),
                Arguments.of(1.0, new Expression("+", 1, 0)),
                Arguments.of(1.0, new Expression("+", 0, 1)),
                Arguments.of(0.0, new Expression("+", 1, -1)),
                Arguments.of(0.0, new Expression("+", -1, 1)),
                Arguments.of(-2.0, new Expression("+", -1, -1))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(Double expected, Expression expression) {
        double result = addition.calculate(expression);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "true, +",
            "false, $",
    })
    void matches(boolean expected, String symbol) {
        Expression expression = new Expression(symbol, 0, 0);

        boolean result = addition.matches(expression);

        assertEquals(expected, result);
    }
}