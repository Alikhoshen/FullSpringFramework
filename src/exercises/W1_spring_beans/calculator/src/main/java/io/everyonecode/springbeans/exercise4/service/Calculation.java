package io.everyonecode.springbeans.exercise4.service;

import io.everyonecode.springbeans.exercise4.model.Expression;

public abstract class Calculation {
    protected String symbol; // it should be protected

    public Calculation(String symbol) {
        this.symbol = symbol;
    }

    protected Calculation() {
    }

    public boolean matches(Expression expression){
        return symbol.equals(expression.getSymbol());
    };

    public abstract double calculate(Expression expression);
}
