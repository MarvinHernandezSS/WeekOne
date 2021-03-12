/**
 * 
 */
package com.ss.mar.jb.AssignmentFour;

import java.util.Queue;
import java.util.Random;

/**
 * @author marvi
 *
 */
public class Producer implements Runnable {
	
	//Queue > List in this case because of FIFO
	private Queue<Integer> sharedQueue;
	//Max size of elements allowed in the queue 0,1,2,3,4,5
	private final int MAX_SIZE = 5;
	
	//constructor takes in external Queue to make its private sharedQueue
	//which will be the same Queue that the Consumer class will also take in
	public Producer(Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	

	@Override
	public void run() {
		//true- assuming production state go go!!
		while (true) {
			synchronized(sharedQueue) {
				// while queue is full wait until there is space available b4 producing
				while (sharedQueue.size() == 5) {
					try {
						System.out.println("Producer is waiting for the consumer to consume stuff.....");
						//wait is from Object - Causes the current thread to wait until it is awakened, typically by being notified
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//making random stuff to put in queue
				Random random = new Random();
				int data = random.nextInt(MAX_SIZE);
				sharedQueue.add(data);
				System.out.println("Produced::"+ data);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//notify is from Object - Wakes up a single thread that is waiting on this object's monitor.
				sharedQueue.notify();
			}
		}
		

	}

}
