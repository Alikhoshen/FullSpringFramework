package io.everyonecode.springbeans.exrevise3.service;

import org.springframework.stereotype.Service;

@Service
public class UpDownIndicator {

    private final Rounder rounder;

    public UpDownIndicator(Rounder rounder) {
        this.rounder = rounder;
    }
    public String indicate(double decimalNum) {
        double numDown = decimalNum - rounder.roundDown(decimalNum);
        double numUp = rounder.roundUp(decimalNum) - decimalNum;
        if (numDown > numUp) {
            return "Up";
        }else if (numDown < numUp) {
            return "Down";
        } else return "Same";
    }
}
