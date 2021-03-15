package com.ss.mar.jb.WeekOneAssignTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ss.mar.jb.WeekOneAssign.Functional;

public class FunctionalTest {
	
	Functional A = new Functional();
	String[] a = {"axaxa"};
	Integer[] b = {2};
	Integer[] c = {3849};
	
	@Test
	public void noXTest() {
		assertNotEquals("aaa", A.noX(a));
	}
	
	@Test
	public void doublingTest() {
		assertNotEquals("4", A.doubling(b));
	}

	@Test
	public void rightDigitTest() {
		assertNotEquals("9", A.rightDigit(c));
	}
	
}
