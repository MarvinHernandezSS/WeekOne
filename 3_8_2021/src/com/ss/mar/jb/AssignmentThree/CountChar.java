/**
 * 
 */
package com.ss.mar.jb.AssignmentThree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author marvi
 *
 */
public class CountChar {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);






		System.out.println("Please specify the file you want to read:");

		String x = userInput.next();


		System.out.println("What is the character you'd like counted?");

		String y = userInput.next();

		char[] C = y.toCharArray();


		String line;
		List<String> A = new ArrayList<String>();

		Integer nums = 0;


		try {
			FileReader file = new FileReader(x);
			BufferedReader br = new BufferedReader(file);

			while ((line = br.readLine()) != null) {

				A.add(line);
			}

			br.close();

			if (!A.isEmpty()) {


				for (String string : A) {
					for (Character c : string.toCharArray()) {
						if (c.equals(C[0])) {
							nums++;
						}

					}
				}
				
				System.out.println(nums);
			}


		} catch (Exception e) {
			// TODO: handle exception
			// TODO: handle exception
			System.out.println("Please double check the name of your file.");

		}




		userInput.close();



	}

}
