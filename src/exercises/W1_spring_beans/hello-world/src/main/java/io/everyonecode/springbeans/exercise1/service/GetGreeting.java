package io.everyonecode.springbeans.exercise1.service;

import org.springframework.stereotype.Service;

@Service
public class GetGreeting {

    public String getGreeting() {
        return "Hello World!";
    }
}
