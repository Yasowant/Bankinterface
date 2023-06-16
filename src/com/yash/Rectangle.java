package com.yash;

public class Rectangle implements Shape {
	double length;
	double bredth;

	public Rectangle(double length, double bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*bredth;
	}

	@Override
	public void printInfo() {
		System.out.println("Length :"+length);
		System.out.println("Bredth :"+bredth);
		System.out.println("Area is :"+getArea());

	}

}
