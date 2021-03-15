package com.ss.mar.jb.AssignmentFive;




import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

public class LambdasNFuncs {
	
	
	public static void main(String[] args) {
		
		//ArrayList of a few strings
		List<String> fewStrings = new ArrayList<String>();
		fewStrings.add("tooo");
		fewStrings.add("one");
		fewStrings.add("fifth");
		fewStrings.add("el Paso");
		
		//Lambda format (parameters) -> expression
		
		LambdasNFuncs A = new LambdasNFuncs();
		
		
		A.short2Long(fewStrings);
//		List<String> short2Long = fewStrings.stream().sorted((a,b)-> a.length() - b.length()).collect(Collectors.toList());
//		System.out.println("From shortest lenght to greatest lenght.");
//		short2Long.forEach((x)->System.out.println(x));
				
		A.long2Short(fewStrings);
//		System.out.println("From greatest lenght to shortest lenght.");
//		List<String> long2Short = short2Long.stream().sorted((a,b)-> b.length() - a.length()).collect(Collectors.toList());
//		long2Short.forEach((x)->System.out.println(x));
		
		A.abcByFirstChar(fewStrings);
//		System.out.println("alphabetically by the first character only");
//		List<String> abcByFirstChar = fewStrings.stream().sorted((a,b)-> a.charAt(0) - b.charAt(0) ).collect(Collectors.toList());
//		abcByFirstChar.forEach(x->System.out.println(x));
		
		A.eFirst(fewStrings);
//		System.out.println("Strings that contain “e” first, everything else second");
//		List<String> eFirst = fewStrings.stream().sorted((a,b)-> (a.contains("E") || a.contains("e") ? -1 : 0)).collect(Collectors.toList());
//		eFirst.forEach(x->System.out.println(x));
		
		
		
		
		Comparator<String> can = new Comparator<String>() {

			@Override
			public int compare(String one, String two) {
				return one.contains("E")||one.contains("e") ? -1 :0;
			}

		};
		
		A.eHelperFirst(fewStrings);
//		System.out.println("Helper method for Strings that contain “e” first, everything else second");
////		ArrayList<String> eHelperFirst = Arrays.sort(fewStrings.toArray(), (s1,s2) -> can.compare(s1, s2));
//		List<String> eHelperFirst = fewStrings.stream().sorted((a,b) -> ehelper(a, b)).collect(Collectors.toList());
//		eHelperFirst.forEach(x->System.out.println(x));
		
		
		
		
		
		A.oddsAndEvens();
//		List<Integer> nums = new ArrayList<Integer>();
//		nums.add(1);
//		nums.add(2);
//		nums.add(33);
//		nums.add(42);
//		
//		
//		List<String> oddsAndEvens= nums.stream().map(x -> x%2 == 0 ? "e" + x : "o" + x).collect(Collectors.toList());
//		
//		//Alternate with Curly Braces and if then, couldn't get Curly Braces to work with Ternary
//		/*
//		 * List<String> oddsAndEvens= nums.stream().map(x -> { if (x%2 == 0) return "e"
//		 * + x; else { return "o" + x; }
//		 * 
//		 * }).collect(Collectors.toList());
//		 */
//		System.out.println("Integers to Strings denoting Odds or Evens");
//		oddsAndEvens.forEach(x -> System.out.println(x));
		
		A.words();
//		System.out.println("filtered list of 3 letter strings that start with 'a'");
//		List<String> words = new ArrayList<String>();
//		words.add("add"); words.add("cab");
//		words.add("are"); words.add("apple");
//		words.add("car"); words.add("all");
//		words.add("Alan"); words.add("ark");
//		words.add("Jupitar"); words.add("fire");
//		words.add("Ale"); words.add("Abc");
//		
//		
//		var x = words.stream().filter(a -> (a.charAt(0) == 'a' ? (a.length() == 3 ? true : false) : false)).collect(Collectors.toList());
//		x.forEach(a -> System.out.println(a));
		

		
	}
	
	
	public static Integer ehelper(String one, String two) {		
		return one.contains("E")||one.contains("e") ? -1 :0;
	}



	public Boolean short2Long(List<String> fewStrings) {
		List<String> short2Long = fewStrings.stream().sorted((a,b)-> a.length() - b.length()).collect(Collectors.toList());
		System.out.println("From shortest lenght to greatest lenght.");
		short2Long.forEach((x)->System.out.println(x));
		return true;
	}


	public Boolean long2Short(List<String> short2Long) {
		System.out.println("From greatest lenght to shortest lenght.");
		List<String> long2Short = short2Long.stream().sorted((a,b)-> b.length() - a.length()).collect(Collectors.toList());
		long2Short.forEach((x)->System.out.println(x));
		return true;
	}


	public Boolean abcByFirstChar(List<String> fewStrings) {
		System.out.println("alphabetically by the first character only");
		List<String> abcByFirstChar = fewStrings.stream().sorted((a,b)-> a.charAt(0) - b.charAt(0) ).collect(Collectors.toList());
		abcByFirstChar.forEach(x->System.out.println(x));
		return true;
	}


	public Boolean eFirst(List<String> fewStrings) {
		System.out.println("Strings that contain “e” first, everything else second");
		List<String> eFirst = fewStrings.stream().sorted((a,b)-> (a.contains("E") || a.contains("e") ? -1 : 0)).collect(Collectors.toList());
		eFirst.forEach(x->System.out.println(x));
		return true;
	}


	public Boolean eHelperFirst(List<String> fewStrings) {
		System.out.println("Helper method for Strings that contain “e” first, everything else second");
//		ArrayList<String> eHelperFirst = Arrays.sort(fewStrings.toArray(), (s1,s2) -> can.compare(s1, s2));
		List<String> eHelperFirst = fewStrings.stream().sorted((a,b) -> ehelper(a, b)).collect(Collectors.toList());
		eHelperFirst.forEach(x->System.out.println(x));
		return true;
	}


	public Boolean oddsAndEvens() {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(33);
		nums.add(42);
		
		
		List<String> oddsAndEvens= nums.stream().map(x -> x%2 == 0 ? "e" + x : "o" + x).collect(Collectors.toList());
		
		//Alternate with Curly Braces and if then, couldn't get Curly Braces to work with Ternary
		/*
		 * List<String> oddsAndEvens= nums.stream().map(x -> { if (x%2 == 0) return "e"
		 * + x; else { return "o" + x; }
		 * 
		 * }).collect(Collectors.toList());
		 */
		System.out.println("Integers to Strings denoting Odds or Evens");
		oddsAndEvens.forEach(x -> System.out.println(x));
		return true;
	}


	public Boolean words() {
		System.out.println("filtered list of 3 letter strings that start with 'a'");
		List<String> words = new ArrayList<String>();
		words.add("add"); words.add("cab");
		words.add("are"); words.add("apple");
		words.add("car"); words.add("all");
		words.add("Alan"); words.add("ark");
		words.add("Jupitar"); words.add("fire");
		words.add("Ale"); words.add("Abc");
		
		
		var x = words.stream().filter(a -> (a.charAt(0) == 'a' ? (a.length() == 3 ? true : false) : false)).collect(Collectors.toList());
		x.forEach(a -> System.out.println(a));
		return true;
	}
	

}
