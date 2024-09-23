package io.everyonecode.springbeans.fizzbuzz.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FizzBuzzTest {

    @Autowired
    FizzBuzz fizzBuzz;

    @ParameterizedTest
    @CsvSource({
            "Fizz, 9",
            "Fizz, 12",
            "FizzBuzz, 15"
    })
    void findFizzBuzz(String expected, int input) {
        assertEquals(expected, fizzBuzz.findFizzBuzz(input));

    }
}