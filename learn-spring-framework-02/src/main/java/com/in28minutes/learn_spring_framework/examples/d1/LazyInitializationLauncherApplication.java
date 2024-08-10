package com.in28minutes.learn_spring_framework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some initialization logic right here!");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do something!");
	}
	
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
			System.out.println("Initialization of context is completed");
			context.getBean(ClassB.class).doSomething();;
		}
	}
}
