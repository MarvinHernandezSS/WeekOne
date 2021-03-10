/**
 * 
 */
package com.ss.mar.jb.AssignmentTwo2;

/**
 * @author marvi
 *
 */
public class Triangle implements Shape {
	
	Double Height;
	Double Base;
	Double Area;
	
	
	public Triangle(Double base, Double height) {
		// TODO Auto-generated constructor stub
		this.Base = base;
		this.Height = height;
		Area = this.calculateArea(this.Base,this.Height);
		
	}

	@Override
	public Double calculateArea(Double... values) {
		// TODO Auto-generated method stub
		Double A = 0.5* (values[0] * values[1]);
		
		return A ;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of this Triangle is: " + this.Area);
		
	}



}
