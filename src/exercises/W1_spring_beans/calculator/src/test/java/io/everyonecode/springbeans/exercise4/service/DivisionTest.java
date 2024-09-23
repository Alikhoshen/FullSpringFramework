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
class DivisionTest {

    @Autowired
    private Calculation division;

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(Double.NaN, new Expression("/", 0, 0)),
                Arguments.of(1.0, new Expression("/", 1, 1)),
                Arguments.of(-1.0, new Expression("/", 1, -1)),
                Arguments.of(-1.0, new Expression("/", -1, 1)),
                Arguments.of(1.0, new Expression("/", -1, -1))
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void calculate(double expected, Expression input) {

        assertEquals(expected, division.calculate(input));

    }
    @ParameterizedTest
    @CsvSource({
            "true, /",
            "false, $"
    })
    void match (boolean expected, String input) {
        Expression expression = new Expression(input,0,0);
        Boolean result = division.matches(expression);
        assertEquals(expected, result);
    }
}