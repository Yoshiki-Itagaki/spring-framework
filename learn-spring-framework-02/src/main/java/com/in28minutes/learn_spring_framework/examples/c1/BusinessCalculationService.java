package com.in28minutes.learn_spring_framework.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component
@Service
class BusinessCalculationService {		
	
	@Autowired
	DataService dataService;		
	
	@Autowired
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
		System.out.println("Finding the max...");
		System.out.println(findMax());
	}	
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
	
}
