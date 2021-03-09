/**
 * 
 */
package com.ss.mar.jb.AssingmentOne;

/**
 * @author marvi
 *
 */
public class Pattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] one = {'*', ' ', ' ', ' '};
		char[] two = {'*', '*', ' ', ' '};
		char[] three = {'*', '*', '*', ' '};
		char[] four = {'*', '*', '*', '*'};
		char[][] myCharArrays = {one, two, three, four};
		
		System.out.println("1)");
		for (int i = 0; i < myCharArrays.length; i++) {
			for (int j = 0; j < myCharArrays[i].length; j++) {
				System.out.print(myCharArrays[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 9; i++) {
			System.out.print(".");
			if (i == 8) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("2)");
		
		for (int i = 0; i < 10; i++) {
			System.out.print(".");
			if (i == 9) {
				System.out.println();
			}
		}
		
		for (int i = myCharArrays.length -1; i >= 0; i--) {
			for (int j = 0; j < myCharArrays[i].length; j++) {
				System.out.print(myCharArrays[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("3)");
		
		
		char[] sevenOne = {' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ',' ', ' '};
		char[] sevenTwo = {' ', ' ',' ', ' ', '*', '*', '*', ' ', ' ',' ', ' '};
		char[] sevenThree = {' ', ' ',' ', '*', '*', '*', '*', '*', ' ',' ', ' '};
		char[] sevenFour = {' ', ' ','*', '*', '*', '*', '*', '*', '*',' ', ' '};
		char[][] mySevenCharArrays = {sevenOne, sevenTwo, sevenThree, sevenFour};
		
		
		for (int i = 0; i < mySevenCharArrays.length; i++) {
			for (int j = 0; j < mySevenCharArrays[i].length; j++) {
				System.out.print(mySevenCharArrays[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < 11; i++) {
			System.out.print(".");
			if (i == 10) {
				System.out.println();
			}
		}
				
		
		System.out.println();
		
		System.out.println("4)");
		
		for (int i = 0; i < 12; i++) {
			System.out.print(".");
			if (i == 11) {
				System.out.println();
			}
		}
		
		for (int i = mySevenCharArrays.length -1; i >= 0; i--) {
			for (int j = 0; j < mySevenCharArrays[i].length; j++) {
				System.out.print(mySevenCharArrays[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
