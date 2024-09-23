package io.everyonecode.springbeans.exercise4.service;

import io.everyonecode.springbeans.exercise4.model.Expression;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class Calculator {

    private final ExpressionParser expressionParser;
    private final Set<Calculation> calculations;

    public Calculator(ExpressionParser expressionParser, Set<Calculation> calculations) {
        this.expressionParser = expressionParser;
        this.calculations = calculations;
    }

    // Main method to perform the calculation
    public double calculate(String input) {
        // Parse the input string into an Expression object
        Expression expression = expressionParser.parse(input);

        // Find the appropriate calculation by matching the symbol
        return calculations.stream()
                .filter(calculation -> calculation.matches(expression))
                .findFirst()
                .map(calculation -> calculation.calculate(expression))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported calculation: " + expression.getSymbol()));
    }
}
