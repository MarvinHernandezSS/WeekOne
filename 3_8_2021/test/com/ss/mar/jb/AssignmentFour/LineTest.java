/**
 * 
 */
package com.ss.mar.jb.AssignmentFour;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * @author marvi
 *
 */
public class LineTest {
	
	Line A = new Line(.0001, .0002, .0003, .0004);
	Line B = new Line(.001,.002,.003,.004);
	
	
	@Test
	public void getSlopeTest() {
		assertEquals(1.0000000000000002, A.getSlope());
		
	}
	
	@Test
	public void getDistancetest() {
		assertNotEquals(3, A.getDistance());
	}
	
	@Test
	public void parrallelToTest() {
		assertEquals(true, A.parallelTo(B));
		
	}
	
	
	
	
	

}
