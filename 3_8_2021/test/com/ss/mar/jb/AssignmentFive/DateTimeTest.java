/**
 * 
 */
package com.ss.mar.jb.AssignmentFive;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDateTime;

import org.junit.Test;

/**
 * @author marvi
 *
 */
public class DateTimeTest {
	
	
	DateTime A = new DateTime();
	
	@Test
	public void birthdayTest() {
		assertEquals(true, A.birthday());
		
	}
	
	@Test
	public void previousThursdayTest() {
		assertNotEquals(LocalDateTime.of(2021,3, 10,0,0),
				A.previousThursday(LocalDateTime.now().minusDays(5)));
	}
	
	@Test
	public void previousThursdayHelperTest() {
		assertEquals(true, A.previousThursdayHelper(1));
	}
	

}
