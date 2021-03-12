/**
 * 
 */
package com.ss.mar.jb.AssignmentFour;



/**
 * @author marvi
 *
 */
public class SingletonDoubleCheck {

	private volatile static SingletonDoubleCheck instance = null;

	//private constructor
	private SingletonDoubleCheck() {}


	public static SingletonDoubleCheck getInstance() {
		//1st check
		if (instance==null) {
			synchronized (SingletonDoubleCheck.class) {
				//2nd check
				if (instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}
		}

		return instance;
	}


	synchronized public Boolean printer(String... values) {
		for (String string : values) {
			System.out.println(string);
		}
		return true;
	}



}
