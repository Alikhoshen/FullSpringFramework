package io.everyonecode.springbeans.fizzbuzz.service;

public class FizzBuzz {

    private final MultipleFinder multipleFinderThree;
    private final MultipleFinder multipleFinderFive;

    public FizzBuzz(MultipleFinder multipleFinderThree, MultipleFinder multipleFinderFive) {
        this.multipleFinderThree = multipleFinderThree;
        this.multipleFinderFive = multipleFinderFive;

    }
    public String findFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else return String.valueOf(number);
    }
}
