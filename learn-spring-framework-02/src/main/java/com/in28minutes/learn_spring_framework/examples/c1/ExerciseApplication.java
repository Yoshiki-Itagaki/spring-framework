package com.in28minutes.learn_spring_framework.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
class businessCalculationService {		
	
	@Autowired
	DataService dataService;		
	
	@Autowired
	public businessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
		System.out.println("Finding the max...");
		System.out.println(findMax());
	}	
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
	
}


@Component
@Primary
class MongoDbDataService implements DataService {
	public int[] retrieveData(){
		return new int[] {11, 22, 33, 44, 55};		
	}	
}

@Component
class MySqlDataService implements DataService {
	public int[] retrieveData() {
		return new int[] {1, 2, 3, 4, 5};
	}
}
	
	
@Configuration
@ComponentScan()
public class ExerciseApplication {	
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(ExerciseApplication.class)){
				System.out.println(businessCalculationService.class);			
		}		
		
	}
	
}

	
	





