package io.everyonecode.springbeans.fizzbuzz.config;

import io.everyonecode.springbeans.fizzbuzz.service.FizzBuzz;
import io.everyonecode.springbeans.fizzbuzz.service.MultipleFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleFinderConfiguration {
    @Bean
    MultipleFinder multipleFinderThree(){
        return new MultipleFinder(3);
    }

    @Bean
    MultipleFinder multipleFinderFive(){
        return new MultipleFinder(5);
    }

    @Bean
    FizzBuzz fizzBuzz(MultipleFinder multipleFinderThree, MultipleFinder multipleFinderFive){
        return new FizzBuzz(multipleFinderThree, multipleFinderFive);
    }


}
