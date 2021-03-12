package com.ss.mar.jb.AssignmentFour;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingletonDoubleCheckTest {
	
	
	SingletonDoubleCheck A = SingletonDoubleCheck.getInstance();
	
	@Test
	public void printerTest() {
		assertEquals(true, A.printer("test"));		
	}
	
	
	

}
