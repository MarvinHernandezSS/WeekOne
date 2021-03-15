/**
 * 
 */
package com.ss.mar.jb.AssignmentFive;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.util.Random;

/**
 * @author marvi
 *
 */
public class Given {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Given A = new Given();
//		A.monthInYear(1);
		A.Mondays(1);
//		A.isFriday13(LocalDateTime.of(2020, 11, 13, 0, 0));
//		A.isFriday13(LocalDateTime.of(2020, 7, 13, 0, 0));
//		A.isFriday13(LocalDateTime.of(1815, 1, 13, 0, 0));
//		A.isFriday13(LocalDateTime.of(1815, 10, 13, 0, 0));
		



	}

	public Boolean monthInYear(int b) {

		Random rand = new Random();
		for (int z = 1; z <= b; z++) {
			int x = rand.nextInt(2025);

			LocalDateTime a = LocalDateTime.now();

			//		Year year = Year.of(a.getYear());
			Year year = Year.of(x);

			//		year = year.minusYears(1);
			System.out.println(x);

			int y = 0;

			for (int i = 1; i < 12; i++) {
				y = year.atMonth(i).lengthOfMonth();
				System.out.println(a.withMonth(i).getMonth() + " has " + y + " days");

			}
		}

		return true;
	}


	public Boolean Mondays(int b) {

		Random rand = new Random();
		for (int z = 1; z <= b; z++) {
			int x = rand.nextInt(2025);

			LocalDateTime a = LocalDateTime.now();

			//		Year year = Year.of(a.getYear());
			Year year = Year.of(x);

			//		year = year.minusYears(1);
			System.out.println(x);

			int y = 0;

			for (int i = 1; i <= 12; i++) {
				y = year.atMonth(i).lengthOfMonth();
				for (int j = 1; j < y; j++) {
					if (year.atMonth(i).atDay(j).getDayOfWeek().getValue() == 1) {
						System.out.println(" Year: " + x + " Month: " + i + " Day " + j + "  " + 
								year.atMonth(i).atDay(j).getDayOfWeek().name());
					}					
				}					
				System.out.println(a.withMonth(i).getMonth() + " has " + y + " days");
			}
		}

		return true;
	}
	
	
	
	public Boolean isFriday13(LocalDateTime x ) {
		
		if (x.getDayOfWeek()== DayOfWeek.FRIDAY && x.getDayOfMonth() == 13){
			System.out.println(x + " boo");
			return true;}else {
				System.out.println(x + " don't be scarred");
			return false;
		}
	}
	
	
	
	

}
