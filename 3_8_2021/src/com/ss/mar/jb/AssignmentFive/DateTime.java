/**
 * 
 */
package com.ss.mar.jb.AssignmentFive;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

/**
 * @author marvi
 *
 */
public class DateTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTime A = new DateTime();
		A.birthday();
		
		A.previousThursdayHelper(3);

		
//		int y = 57;
//		int x = LocalDateTime.now().getDayOfWeek().getValue();
//		
//		System.out.println(LocalDateTime.now().getDayOfWeek());
//		System.out.println(x);
//		System.out.println(LocalDateTime.now().minusDays(y));
//		
//		LocalDateTime B = A.previousThursday(LocalDateTime.now().minusDays(y));
//		System.out.println(B + " " + B.getDayOfWeek());
		

	}

	public Boolean birthday() {
		LocalDateTime bday = LocalDateTime.of(1980,7,31,8,30);
		System.out.println("My Birthday: " + bday.toString());
		return true;
	}

	public LocalDateTime previousThursday(LocalDateTime date) {
		int randDayOfWeek = date.getDayOfWeek().getValue();
		int thurs = 4;
		System.out.println("Given date: " + date + " " + date.getDayOfWeek());
		
		return randDayOfWeek > thurs ?  date.minusDays(Math.abs(randDayOfWeek - thurs)) : date.minusDays( 7 - Math.abs(randDayOfWeek - thurs));	

	}
	
	public Boolean previousThursdayHelper(Integer x) {
		DateTime A = new DateTime();
		Random rand = new Random();
		int a = 0;
		LocalDateTime C = null;
		
		for (int i = 0; i < x; i++) {
			a = rand.nextInt(200);
//			System.out.println(a);	//debug purpose
			C = A.previousThursday(LocalDateTime.now().minusDays(a));
			System.out.println("Previous Thursday was " + C + " " + C.getDayOfWeek());
			
		}
		return true;
		
	}
	
	


}
