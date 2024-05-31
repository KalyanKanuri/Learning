package com.Learning.LearnSB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleSBClass {

    @Autowired
    SampleDependentClass sdc;

    public void display() {
        System.out.println("Hello From SampleSBClass");
        sdc.printer();
    }

}
