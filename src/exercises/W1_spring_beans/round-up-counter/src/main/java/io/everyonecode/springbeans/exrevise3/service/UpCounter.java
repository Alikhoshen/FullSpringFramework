package io.everyonecode.springbeans.exrevise3.service;

import org.springframework.stereotype.Service;
import org.w3c.dom.css.Counter;

import java.util.List;
import java.util.Objects;

@Service
public class UpCounter {
    private final UpDownIndicator upDownIndicator;

    public UpCounter(final UpDownIndicator upDownIndicator) {
        this.upDownIndicator = upDownIndicator;
    }

    public long count(List<Double> decimals) {
        return (int) decimals.stream()
                .filter(value -> upDownIndicator.indicate(value).equals("Up"))
                .count();
    }
}


