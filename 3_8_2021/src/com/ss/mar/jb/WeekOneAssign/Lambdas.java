/**
 * 
 */
package com.ss.mar.jb.WeekOneAssign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author marvi
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lambdas A = new Lambdas();

		ArrayList<String[]> userTestCases = A.readUserInputByLine();

		/*
		 * System.out.println("traditional"); System.out.println(userTestCases.size());
		 * 
		 * for (String[] strings : userTestCases) { if (strings.length > 1) {
		 * System.out.println(strings[0] + " " + strings[1]); } }
		 */
//	ArrayList<String> r = new ArrayList<String>();
//	
//	userTestCases.stream().filter(x -> x.length > 1).filter(x-> x[0] = 1).
//	map(x -> { x *2 });

		List<String> results = A.testSelector(userTestCases);

		Arrays.stream(results.toArray()).forEach(x -> System.out.println(x));

//	b.stream().filter(x -> x.length > 1).forEach(x -> System.out.println(x[0] + " " + x[1]));

	}

	public ArrayList<String> testSelector(ArrayList<String[]> userTestCases) {
		ArrayList<String> results = new ArrayList<String>();
		for (String[] strings : userTestCases) {
			if (strings.length > 1) {
//				System.out.println("debug" + strings[0] + " " + strings[1]);
				switch (strings[0]) {
				case "1": {
					results.add(isOddOrEven(strings[1]));
					break;
				}
				case "2": {
					results.add(isPrime(strings[1]));
					break;
				}
				case "3": {
					results.add(isPalindrome(strings[1]));
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: ");
				}
			}
		}
		return results;
	}

	public String isPalindrome(String string) {
		String result = "";
		StringBuilder x = new StringBuilder(string);
		result = string.equals(x.reverse().toString()) ? "PALINDROME" : "NOT A PALINDROME";
//		System.out.println(result);
		return result;
	}

	public String isPrime(String string) {
		Integer x = safeIntParse(string);
		String result = "";
		Integer count = 0;
		if (x < 2) {
			result = "COMPOSITE";
//			System.out.println("its " + result);
			return result;
		} else {
			for (int i = 1; i <= x; i++) {
				if (x % i == 0)
					count++;
			}
			result = count > 2 ? "COMPOSITE" : "PRIME";
//			System.out.println("count: " + count);
//			System.out.println("its " + result);
			return result;
		}
	}

	public static Integer safeIntParse(String s) {
		Integer x = 0;
		try {
			x = Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println("Looks like one or more test input was not numerical. Please try again.");
		}
		return x;
	}

	
	public String isOddOrEven(String string) { 
		Integer x = safeIntParse(string);
		String result = "";
		result = x % 2 == 0 ? "EVEN" : "ODD"; 
		// System.out.println("its " + result);
		return result; 
	}
	 

	public ArrayList<String[]> readUserInputByLine() {

		String inputCommands;
		String[] commands;
		Scanner userInput = new Scanner(System.in);
		ArrayList<String[]> list = new ArrayList<String[]>();

		System.out.println("Please enter # of test cases:");

		try {
			Integer x = userInput.nextInt();
			System.out.println("enter test parameters:");

			for (int i = 0; i <= x; i++) {
				inputCommands = userInput.nextLine();
				commands = inputCommands.split(" ");
				list.add(commands);
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid # for the number of test cases");
		} finally {
			userInput.close();
		}
		return list;
	}

}
