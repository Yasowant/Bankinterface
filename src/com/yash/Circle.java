package com.yash;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {

		return 3.143*radius*radius;
	}

	@Override
	public void printInfo() {
		System.out.println("Radius is:"+radius);
		System.out.println("Area is:"+getArea());

	}

}
