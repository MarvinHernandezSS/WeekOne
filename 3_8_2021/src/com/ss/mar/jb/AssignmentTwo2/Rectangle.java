/**
 * 
 */
package com.ss.mar.jb.AssignmentTwo2;

/**
 * @author marvi
 *
 */
public class Rectangle implements Shape{
	
	Double Width;
	Double Lenth;
	Double Area;

	public Rectangle(Double width, Double lenth) {
		// TODO Auto-generated constructor stub
		this.Width = width;
		this.Lenth = lenth;
		this.Area = this.calculateArea(this.Width, this.Lenth);
	}
	
	@Override
	public Double calculateArea(Double... values) {
		// TODO Auto-generated method stub
		Double A = values[0] * values[1];
		return A;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of this Rectangle is: " + this.Area);
		
	}



}
