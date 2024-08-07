package com.in28minutes.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

// Field Injections
//	@Autowired
	Dependency1 dependency1;
//	@Autowired
	Dependency2 dependency2;

// Constructor Injections * You can remove the @Autowired annotation from the constructor
//@Autowired
public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
	super();
	System.out.println("Constructor Injection - Your Business Class");
	this.dependency1 = dependency1;
	this.dependency2 = dependency2;
}
	
	
	
// Setter Injections
//	public Dependency1 getDependency1() {
//		return dependency1;
//	}
//
//
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection - setDependency1");
//		this.dependency1 = dependency1;
//	}
//
//
//	public Dependency2 getDependency2() {
//		return dependency2;
//	}
//
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - setDependency2");
//		this.dependency2 = dependency2;
//	}
//
//
//
//	public String toString() {
//		return "Using " + dependency1 + " and " + dependency2;
//	}
	
}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}

@Configuration
@ComponentScan()
public class DepInjectionLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);	
			
			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}
}
