package com.ss.mar.jb.WeekOneAssignTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ss.mar.jb.WeekOneAssign.Recursion;

public class RecursionTest {
	
	Recursion A = new Recursion();
	int[] temp = {2, 4, 8 };
	
	
	@Test
	public void groupSumClumpTest() {
		assertEquals(true, A.groupSumClump(0, temp, 10));
	}

}
