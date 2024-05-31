package com.Learning.LearnSB;

import org.springframework.stereotype.Component;

@Component
public class SampleDependentClass {

    public void printer() {
        System.out.println("I am printer");
        System.out.println("Hello from SampleDependentClass");
    }
}
