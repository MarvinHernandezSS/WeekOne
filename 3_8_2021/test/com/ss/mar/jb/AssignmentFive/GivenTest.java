package com.ss.mar.jb.AssignmentFive;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class GivenTest {
	
	Given give = new Given();
	
	@Test
	public void monthInYearTest() {
		assertEquals(true, give.monthInYear(0));
		
	}
	
	@Test
	public void MondaysTest() {
		
		assertEquals(true, give.Mondays(1));
	}
	

	@Test
	public void isFriday13Test() {
		assertEquals(true, give.isFriday13(LocalDateTime.of(2020, 11, 13, 0, 0)));
	}
}
