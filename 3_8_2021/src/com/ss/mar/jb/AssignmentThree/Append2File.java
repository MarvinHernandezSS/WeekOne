/**
 * 
 */
package com.ss.mar.jb.AssignmentThree;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author marvi
 *
 */
public class Append2File {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Please give the full path to the file you wish to Append to: ");

		Scanner userInput = new Scanner(System.in);

		String x = userInput.next();



		System.out.println("What would you like to append?");

		String y = userInput.next();


		FileOutputStream output = new FileOutputStream(x,true);
		output.write(y.getBytes());


		userInput.close();
		output.close();

	}

}
