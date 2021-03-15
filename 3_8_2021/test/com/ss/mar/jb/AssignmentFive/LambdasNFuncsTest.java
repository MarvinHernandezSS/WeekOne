/**
 * 
 */
package com.ss.mar.jb.AssignmentFive;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author marvi
 *
 */
public class LambdasNFuncsTest {


	LambdasNFuncs  A = new LambdasNFuncs ();
	
	List<String> fewStrings = new ArrayList<String>();
//	fewStrings.add("tooo");
//	fewStrings.add("one");
//	fewStrings.add("fifth");
//	fewStrings.add("el Paso");
	
		
		@Test
		public void ehelperTest() {
//			assertEquals(-1, LambdasNFuncs.ehelper("Elf", "apple"));
//			assertArrayEquals(-1, LambdasNFuncs.ehelper("Elf", "apple"));
			
			
		}
		
		@Test
		public void short2Longtest() {
			assertEquals(true, A.short2Long(fewStrings));
		}
		@Test
		public void long2Shorttest() {
			assertEquals(true, A.long2Short(fewStrings));
		}
		@Test
		public void abcByFirstChartest() {
			assertEquals(true, A.abcByFirstChar(fewStrings));
		}
		@Test
		public void eFirsttest() {
			assertEquals(true, A.eFirst(fewStrings));
		}
		@Test
		public void eHelperFirsttest() {
			assertEquals(true, A.eHelperFirst(fewStrings));
		}
		@Test
		public void oddsAndEvenstest() {
			assertEquals(true, A.oddsAndEvens());
		}
		@Test
		public void wordstest() {
			assertEquals(true, A.words());
		}

	

}
