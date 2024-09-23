package io.everyonecode.springbeans.exercise4.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTest {

    @Autowired
    Calculator calculator;

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(2.0, "1 + 1"),
                Arguments.of(0.0, "1 - 1"),
                Arguments.of(1.0, "1 * 1"),
                Arguments.of(1.0, "1 / 1")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void calculateFindsCalculation(Double expected, String input) {
        Double result = Assertions.assertDoesNotThrow(() -> calculator.calculate(input));

        assertEquals(expected, result);
    }

    @Test
    void calculateDoesNotFindCalculation() {
        String input = "1 $ 1";

        assertThrows(IllegalArgumentException.class, () -> calculator.calculate(input));
    }
}