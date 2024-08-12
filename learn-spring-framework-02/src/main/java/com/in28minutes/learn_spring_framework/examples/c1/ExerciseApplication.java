package com.in28minutes.learn_spring_framework.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
	
	
@Configuration
@ComponentScan()
public class ExerciseApplication {	
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(ExerciseApplication.class)){
				System.out.println(BusinessCalculationService.class);			
		}		
		
	}
	
}