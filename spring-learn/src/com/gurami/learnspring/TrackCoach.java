package com.gurami.learnspring;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {

		return "Run a Hard 5k";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it:"+fortuneService.getFortune();
	}

}
