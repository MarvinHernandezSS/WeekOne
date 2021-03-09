package com.ss.mar.jb.AssingmentOne;

import java.util.Random;

/**
 * 
 */

/**
 * Assignment 3/8/21
 * @author marvi
 *
 */
public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Integer randomNumber = rand.nextInt(100);
		Integer numberOfGuesses = 1;
		
		System.out.println(randomNumber);
		
//		GuessNumber A = new GuessNumber();
		

		System.out.println("Guess a number between 1 and 100");
		
//		var userReply = System.console().readLine();
		
		Integer Guess = Integer.parseInt(System.console().readLine());
		
		
		/*
		 * // if (A.tryParseInt(userReply)) { // Guess = A.successfulParse(userReply);
		 * // }
		 */		

		while (numberOfGuesses <= 4) {
			if (Guess >= randomNumber ? (randomNumber + 10 >= Guess ? true: false) : (randomNumber - 10 <= Guess ? true:false) ) {
				numberOfGuesses++;
				System.out.println("Correct the number was " + randomNumber);
				//numberOfGuesses++;
				break;
				}
				else {
					numberOfGuesses++;
					System.out.println("Guess again");
					Guess = Integer.parseInt(System.console().readLine());
					if (numberOfGuesses == 5) {
						System.out.println("Sorry, the number was " + randomNumber);
					}
				}
		}
		

		
	}
	
	
	/*
	 * Boolean tryParseInt(String x ){
	 * 
	 * try { Integer.parseInt(x); return true; } catch (NumberFormatException e) {
	 * return false; } }
	 * 
	 * 
	 * Integer successfulParse(String x) { return Integer.parseInt(x); }
	 */		
	
		
	/*
	 * private String handleUserInput(String x) { // TODO Auto-generated method stub
	 * Assignment A = new Assignment();
	 * 
	 * if (A.tryParseInt(x)) { return A.successfulParse(x);} else {return
	 * "Please entera valid number between 1 and 100"; } }
	 */

}

