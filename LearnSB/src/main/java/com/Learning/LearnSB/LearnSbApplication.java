package com.Learning.LearnSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSbApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnSbApplication.class, args);

		SampleSBClass sb = context.getBean(SampleSBClass.class);
		sb.display();
	}

}
