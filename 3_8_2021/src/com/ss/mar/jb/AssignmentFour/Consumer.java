/**
 * 
 */
package com.ss.mar.jb.AssignmentFour;

import java.util.Queue;

/**
 * @author marvi
 *
 */
public class Consumer implements Runnable {
	
	//Queue > List in this case because of FIFO assuming an assembly line of PS5's for ex
	private Queue<Integer> sharedQueue;
	
	//constructor takes in external Queue to make its private sharedQueue
	//which will be the same Queue that the Consumer class will also take in
	public Consumer(Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
		
		
	@Override
	public void run() {
		//true- assuming production state go go!! consume or wait and complain
		while (true) {
			synchronized(sharedQueue) {
				//while there is nothing to consume
				while (sharedQueue.isEmpty()) {
					try {
						System.out.println("Consumer is waiting to on the Producer to produce stuff.....");
						//wait is from Object - Causes the current thread to wait until it is awakened, typically by being notified
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//the queue is not empty and the Producer has released the thread
				int data = sharedQueue.poll();
				System.out.println("Consumed::"+data);
				//notify is from Object - Wakes up a single thread that is waiting on this object's monitor.
				sharedQueue.notify();
			}
		}

	}

}
