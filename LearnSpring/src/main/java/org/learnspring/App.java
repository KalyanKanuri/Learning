package org.learnspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * First Spring Project!
 *
 */

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml")) {
            LearnSpring learnSpring = (LearnSpring) context.getBean("learnSpring");
            learnSpring.learning();
        }
    }
}
