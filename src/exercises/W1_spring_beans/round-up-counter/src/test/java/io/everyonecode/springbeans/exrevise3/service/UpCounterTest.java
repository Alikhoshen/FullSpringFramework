package io.everyonecode.springbeans.exrevise3.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UpCounterTest {

    @Autowired
    UpCounter upCounter;

    @Autowired
    UpDownIndicator upDownIndicator;

    @Test
    void count() {
        List<Double>  decimals = new ArrayList<>(List.of(5.5, 6.6, 7.2, 8.8, 0.0));
        int expectedCount = 0;
        for (double decimal : decimals) {
            if(upDownIndicator.indicate(decimal).equals("Up")){
                ++expectedCount;
            }
        }
        assertEquals(expectedCount, upCounter.count(decimals));
    }
}