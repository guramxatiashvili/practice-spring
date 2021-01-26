package com.gurami.learnspring;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//Create a no-arg constructor
	public CricketCoach() {
		System.out.println("ChricketCoach: inside constructor testing");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("ChricketCoach: inside the setter methor - setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
