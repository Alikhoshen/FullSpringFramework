package io.everyonecode.springbeans.exercise4.service;

import io.everyonecode.springbeans.exercise4.model.Expression;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ExpressionParser {

    public Expression parse(String expression) {
        String[] values = expression.split(" ");

        double term1 = Double.parseDouble(values[0]);
        double term2 = Double.parseDouble(values[2]);

        return new Expression(values[1], term1, term2);
    }
}
