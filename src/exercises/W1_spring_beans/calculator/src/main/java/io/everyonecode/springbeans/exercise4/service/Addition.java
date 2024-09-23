package io.everyonecode.springbeans.exercise4.service;

import io.everyonecode.springbeans.exercise4.model.Expression;
import org.springframework.stereotype.Service;

@Service
public class Addition extends Calculation {

    public Addition() {
        super("+");
    }

    @Override
    public double calculate(Expression expression) {
        return expression.getTerm1() + expression.getTerm2();
    }
}
