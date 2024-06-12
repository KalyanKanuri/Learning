package org.learnspring;

import org.learnspring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * First Spring Project!
 *
 */

public class App {
    public static void main(String[] args) {
        // Using XML Config
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml")) {
            LearnSpring learnSpring = (LearnSpring) context.getBean("learnSpring");
            learnSpring.learning();
        }

        // Using Java Config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        LearnSpring ls = (LearnSpring) context.getBean("learnSpring1");
        ls.learning();
    }
}
