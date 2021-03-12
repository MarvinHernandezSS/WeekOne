/**
 * 
 */
package com.ss.mar.jb.AssignmentFour;

/**
 * @author marvi
 *
 */
public class Deadlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Start of app.");

		Integer a = 2;
		Integer b = 3;

		//Defining Runnable to pass to Thread1
		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized(a){
						Thread.sleep(100);
						synchronized(b) {		
							System.out.println(a+b);
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};

		//Defining Runnable to pass to Thread2
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized(b){
						Thread.sleep(100);
						synchronized(a) {
							System.out.println(b-a);
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};

		new Thread(t1).start();
		new Thread(t2).start();


		System.out.println("end of app");


	}

}
