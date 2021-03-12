/**
 * 
 */
package com.ss.mar.jb.AssignmentFour;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author marvi
 *
 */
public class ProducerConsumerCaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//LinkedList is not synchronized by default
		Queue<Integer> sharedQueue = new LinkedList<>();
		
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();
		

	}

}
