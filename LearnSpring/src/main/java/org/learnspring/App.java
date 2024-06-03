package org.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * First Spring Project!
 *
 */

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        try {
            LearnSpring learnSpring = (LearnSpring) context.getBean("learnSpring");
            learnSpring.learning();
        } finally {
            ((ClassPathXmlApplicationContext) context).close();
        }
    }
}
