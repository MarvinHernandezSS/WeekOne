/**
 * 
 */
package com.ss.mar.jb.WeekOneAssign;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marvi
 *
 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] temp = {2, 4, 8 };
		int[] temp1 = {1, 2, 4, 8, 1};
		int[] temp2 = {2, 4, 4, 8};
		Recursion A = new Recursion();


				System.out.println(A.groupSumClump(0, temp,10));
				System.out.println(A.groupSumClump(0, temp1,14));
				System.out.println(A.groupSumClump(0, temp2,14));


	}


	public boolean groupSumClump(int start, int[] nums, int target) {

		//target depletion check
		if (start >= nums.length)
			return target == 0;

		int sum = nums[start];
		int temp = start + 1;

		//temp and target check b4 recursion call
		while (temp < nums.length && nums[temp] == nums[start]) {
			sum += nums[temp++];
		}

		return groupSumClump(temp, nums, target - sum)
				|| groupSumClump(temp, nums, target);
	}

}

