/**
 * 
 */
package com.ss.mar.jb.WeekOneAssign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author marvi
 *
 */
public class Functional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer[] intArray1 = {1, 22, 93};
		Integer[] intArray2 = {16, 8, 886, 8, 1};
		Integer[] intArray3 = {10, 0};
		Functional A = new Functional();
		System.out.println("Rightmost Digit:");
		System.out.println(A.rightDigit(intArray1));
		System.out.println(A.rightDigit(intArray2));
		System.out.println(A.rightDigit(intArray3));
		

		Integer[] doubling1 = {1, 2, 3};
		Integer[] doubling2 = {6, 8, 6, 8, -1};
		System.out.println("Doubling:");
		System.out.println(A.doubling(doubling1));
		System.out.println(A.doubling(doubling2));
		
		
		String[] stringArray1 = {"ax", "bb", "cx"};
		String[] stringArray2 = {"xxax", "xbxbx", "xxcx"};
		String[] stringArray3 = {"x"};
		System.out.println("No X:");
		System.out.println(A.noX(stringArray1));
		System.out.println(A.noX(stringArray2));
		System.out.println(A.noX(stringArray3));
		
		
	}
	
	
	public String noX(String[] stringArray) {
		StringBuilder string = new StringBuilder();
		string.append("From ");
		Arrays.stream(stringArray).forEach(x-> string.append(x + ", "));
		string.append("to ");
		var rightMost1 = Arrays.stream(stringArray).map(x -> x.replaceAll("x", "")).collect(Collectors.toList());
		Arrays.stream(rightMost1.toArray()).forEach(x-> string.append(x + ", "));
		string.deleteCharAt(string.length() -2);
		return string.toString();
	}


	public String doubling(Integer[] intArray) {
		StringBuilder string = new StringBuilder();
		string.append("From ");
		Arrays.stream(intArray).forEach(x-> string.append(x + ", "));
		string.append("to ");
		var rightMost1 = Arrays.stream(intArray).map(x -> x *2).collect(Collectors.toList());
		Arrays.stream(rightMost1.toArray()).forEach(x-> string.append(x + ", "));
		string.deleteCharAt(string.length() -2);
		return string.toString();
	}


	public String rightDigit(Integer[] intArray) {
		StringBuilder string = new StringBuilder();
		string.append("From ");
		Arrays.stream(intArray).forEach(x-> string.append(x + ", "));
		string.append("to ");
		var rightMost1 = Arrays.stream(intArray).map(x -> x.toString().toCharArray()[x.toString().toCharArray().length -1]).collect(Collectors.toList());
		Arrays.stream(rightMost1.toArray()).forEach(x-> string.append(x + ", "));
		string.deleteCharAt(string.length() -2);
		return string.toString();
	}

}
