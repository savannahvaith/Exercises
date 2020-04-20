package com.qa.blackJack;

public class BlackJackRunner {

	public static void main(String[] args) {
		BlackJack bj = new BlackJack(); 
		System.out.println(bj.play(21,3));
		System.out.println(bj.play(3, 4));
	}
	
}
