/**
 * 
 */
package com.ss.mar.jb.AssignmentTwo2;

/**
 * @author marvi
 *
 */
public class Circle implements Shape{
	
	Double Diameter;
	Double Area;
	
	
	public Circle(Double diameter) {
		// TODO Auto-generated constructor stub
		this.Diameter = diameter;
		Area = this.calculateArea(this.Diameter);
	}
	
	


	public Double calculateArea(Double... values) {
		// TODO Auto-generated method stub
		Double A = (Math.PI/4) * (Math.pow(values[0], 2));
		return A;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of this Circle is: " + this.Area);
		
		
	}



}
