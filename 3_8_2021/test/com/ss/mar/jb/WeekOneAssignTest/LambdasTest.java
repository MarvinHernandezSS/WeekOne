package com.ss.mar.jb.WeekOneAssignTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ss.mar.jb.WeekOneAssign.Lambdas;

public class LambdasTest {
	
	
	Lambdas A = new Lambdas();
	
	@Test
	public void isOddOrEvenTest() {
		assertEquals("EVEN", A.isOddOrEven("4"));
	}
	
	@Test
	public void isPrimeTest() {
		assertEquals("PRIME", A.isPrime("5"));
	}
	
	@Test
	public void isPalindrome() {
		assertEquals("PALINDROME", A.isPalindrome("808"));
	}

	
}
