/**
 * 
 */
package com.ss.mar.jb.AssignmentFour;



/**
 * @author marvi
 *
 */
public class SingletonDoubleCheckCaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			Runnable t1 = new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				SingletonDoubleCheck A = SingletonDoubleCheck.getInstance();
					A.printer("Message from Thread:" + System.currentTimeMillis());
					
				}
			};
			
			new Thread(t1).start();
			
			Line A = new Line(.0001, .0002, .0003, .0004);
			System.out.println("getslope: " + A.getSlope());
			System.out.println("getDistance: " + A.getDistance());
			System.out.println("isParrallel: " + A.parallelTo(
					new Line(.001,.002,.003,.004)));
			
		}

	}

}
