package com.ss.mar.jb.AssignmentFour;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class ConsumerTest {
	
	Queue<Integer> q = new  LinkedList<Integer>();
	Consumer A = new Consumer(q);
	
	
	@Test
public void consumerTest() {
	assertNotEquals(A, new Consumer(q));
}



}
