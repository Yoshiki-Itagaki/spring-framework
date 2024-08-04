# spring-container
Getting started with some basic concepts of the Spring Framework, such as Spring Container


**Spring Container**: Manages Spring Beans & their lifecycle
  - Once you create Java classes and configurations, IOC Container creates a runtime system for us * IOC stands for 'Inversion of Control)
  Use Cases: 
    1. Bean Factory: Basic Spring Container
    2. Application Context: Advanced Spring Container with enterprise-specific features

Spring Beans
  - Any Java object that is managed by Spring
  - Spring uses IOC Container to manage these objects
  - When you have multiple candidates, it means that you have 2 or more related beans
    => solutions :
       1. Make one of them 'Primary' using the @Primary annotation.
       2. Use Qualifier: put a qualifier at a class, member variables or method parameteres that you want to provide more control to.
     
  

