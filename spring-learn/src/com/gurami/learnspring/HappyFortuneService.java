package com.gurami.learnspring;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "today is a lucky day";
	}

}
