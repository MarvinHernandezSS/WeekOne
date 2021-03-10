/**
 * 
 */
package com.ss.mar.jb.AssignmentTwo2;

/**
 * @author marvi
 *
 */
public class TwoDArray {
	
	
	public static void main(String[] args) {
		
Integer x = 0;
String y = new String();

		
		
	int[][] two= { {1,7,9,99,2}, {4,2,6,11}};
	
		
		for (int i = 0; i < two.length; i++) {
			
			for (int j = 0; j < two[i].length; j++) {
				
				if (x < two[i][j]) {
					x = two[i][j];
					y = x + (" at position " + i +" , " + j);
					
					}
				}
			}
		
		
		System.out.println(y);
		
			
		}
		
	}


