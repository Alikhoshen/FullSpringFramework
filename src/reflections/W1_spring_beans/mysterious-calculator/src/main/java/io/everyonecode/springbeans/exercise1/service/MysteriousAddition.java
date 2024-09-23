package io.everyonecode.springbeans.exercise1.service;

public class MysteriousAddition {
    private int number;

    public MysteriousAddition(int number) {
        this.number = number;
    }
    public int apply(int a) {
        return number + a;
    }
}
