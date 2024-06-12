package org.learnspring.config;

import org.learnspring.LearnSpring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public LearnSpring learnSpring1(){
        return new LearnSpring();
    }
}
