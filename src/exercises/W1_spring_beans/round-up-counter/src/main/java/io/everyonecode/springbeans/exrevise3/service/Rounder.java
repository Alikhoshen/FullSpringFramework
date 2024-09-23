package io.everyonecode.springbeans.exrevise3.service;

import org.springframework.stereotype.Service;

@Service
public class Rounder {

    public double roundUp(double decimal) {
        return Math.ceil(decimal) ;
    }
    public double roundDown(double decimal) {
        return Math.floor(decimal);
    }
}
