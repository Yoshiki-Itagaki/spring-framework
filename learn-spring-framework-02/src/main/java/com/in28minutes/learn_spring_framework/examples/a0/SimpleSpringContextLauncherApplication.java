package com.in28minutes.learn_spring_framework.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.examples.a1")
public class SimpleSpringContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);			
		}
	}
}
