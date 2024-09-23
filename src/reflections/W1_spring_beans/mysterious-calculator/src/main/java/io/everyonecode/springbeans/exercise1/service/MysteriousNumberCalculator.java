package io.everyonecode.springbeans.exercise1.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Set;
@Service
public class MysteriousNumberCalculator {

    private final Set<MysteriousAddition> mysteriousAdditions;
    private final MysteriousNumberFormatter mysteriousNumberFormatter;

    public MysteriousNumberCalculator(Set<MysteriousAddition> mysteriousAdditions, MysteriousNumberFormatter mysteriousNumberFormatter) {
        this.mysteriousAdditions = mysteriousAdditions;
        this.mysteriousNumberFormatter = mysteriousNumberFormatter;
    }

    public String calculate(int number) {
        for (MysteriousAddition mysteriousAddition : mysteriousAdditions) {
            number = mysteriousAddition.apply(number);
        }
        return mysteriousNumberFormatter.format(number);
    }
}
