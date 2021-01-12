package com.gurami.learnspring;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minuts on batting";
	}

}
