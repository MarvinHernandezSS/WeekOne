/**
 * 
 */
package com.ss.mar.jb.AssignmentThree;

import java.io.File;
import java.io.IOException;
import java.text.Collator;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Pattern;

/**
 * @author marvi
 *
 */
public class RecursiveDirListing {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		System.out.println("Please specify the directory that you would like mapped out: ");
		Scanner userInput = new Scanner(System.in);
		
		
		String dir = readAndValidateUserInput(userInput);
		
		List<String> AA = mapOutUserInput(dir);
		
		
		displayUserMapRequest(AA);
		
		
//		File  myfile = new File (System.getProperty("user.dir"));
//		System.out.println(System.getProperty("user.dir"));
		
		/*
		 * Properties myProps = System.getProperties();
		 * 
		 * 
		 * for (String string : myProps.stringPropertyNames()) { System.out.print(string
		 * + "\t"); System.out.println(myProps.getProperty(string)); }
		 */
			

	}

	private static void displayUserMapRequest(List<String> aA) {

for (String string : aA) {
	System.out.println(string);
}
		
	}

	private static List<String> mapOutUserInput(String dir)  {
		// TODO Auto-generated method stub
		List<String> A = new Vector<String>();
		
		File myFile = new File(dir);
		//String[] files = myFile.list();
		File[] test;
		if (myFile.listFiles() != null) {
			test = myFile.listFiles();
			System.out.println(test.length);
			for (File file : test) {
				System.out.println(file.getAbsolutePath());
				A.add(file.getAbsolutePath());
			}
		}
		
		for (String string : A) {
			
			mapOutUserInput(string);
		}
		
		
		
		return A;
		
//		file.separator
		/*
		 * for (String string : files) { System.out.println(string); }
		 */
		
		
		

		
	}

	private static void displayUserMapRequest(String dir) {
		// TODO Auto-generated method stub
		
	}

	private static String readAndValidateUserInput(Scanner userInput) {
		// TODO Auto-generated method stub
		//C:\Users\marvi regex pattern
		// \D:\\.X+\\X*?.X*?\\X*?.X*?\\X*?.X*?\\X*?.X*?\\X*?.X*?\\X*?.X*?\\X*?.X*?\\X*?.X*?\\X*?.X*?\\X*?.X*?\\X*?.X*?\\X*?.X*?\\X*?.X*?
		//\w:\\\w\{1,99\}\\{0,1\}
//		String x = userInput.next(Pattern.compile("\\D"));
		String x = userInput.next();

//		for (char y : x.toCharArray()) {
//			if
//		}
		
		//System.out.println(x);
		return x;
		
		
	}







}
