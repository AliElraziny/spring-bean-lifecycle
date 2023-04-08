package com.try2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		BaseballCoach theCoach = context.getBean("myCoach", BaseballCoach.class);
		
		System.out.println(theCoach.getFortune());
		
		context.close();
		
	}

}
