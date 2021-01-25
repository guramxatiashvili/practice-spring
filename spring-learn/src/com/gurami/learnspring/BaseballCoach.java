package com.gurami.learnspring;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {}
	//define a constructor for dependeny injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minuts on batting";
	}

	public String getDailyFortune() {
		//use my fortuneService to get fortune
 
		return fortuneService.getFortune();
	}

}
