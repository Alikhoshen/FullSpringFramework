package io.everyonecode.springbeans.exercise1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MysteriousAdditionTest {
    @Test
    void testApply (){
        MysteriousAddition mysteriousAddition = new MysteriousAddition(5);

        int result = mysteriousAddition.apply(3);

        assertEquals(8, result);
    }
}
