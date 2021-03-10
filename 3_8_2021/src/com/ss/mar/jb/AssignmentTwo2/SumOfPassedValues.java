package com.ss.mar.jb.AssignmentTwo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author marvi
 *
 */
public class SumOfPassedValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumOfPassedValues A = new SumOfPassedValues();

		Integer sum = 0;

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please provide the values that you would like the sum of. Enter any non number or non-space character to confirm you have finished enterying:");

		ArrayList<Integer> nums2Sum = A.getUserNumber(userInput);

		sum = A.sumUserNumbers(nums2Sum);

		System.out.println("the sum is " + sum );

		userInput.close();		
	}

	private Integer sumUserNumbers(ArrayList<Integer> x) {
		Integer y = 0;
		for (Integer num : x) {

			y += num;
		}
		return y;
	}
	

	private ArrayList<Integer> getUserNumber(Scanner x) {
		ArrayList<Integer> y = new ArrayList<Integer>();

		try {
			while (x.hasNextInt()) {
				y.add(x.nextInt());
			}
		} catch (Exception e) {
			System.out.println("Looks like your done inputting numbers, lets sum what you have entered so far.");
		}
		finally {
			return y;
		}
	}






}
