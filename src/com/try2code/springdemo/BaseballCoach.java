package com.try2code.springdemo;

public class BaseballCoach implements Coach {
	
	FortuneService fortuneService ;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
		
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run 30 minutes";
	}
	
	public void doMyStartUpSetup() {
		
		System.out.println("Do this setup first >>>");
	}
	
	public void doMyCleanUp() {
		
		System.out.println("Do this Clean >>>");
	}

}
