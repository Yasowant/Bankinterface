package com.yash;

public class Square implements Shape {
	double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

	@Override
	public void printInfo() {
		System.out.println("side is" + side);
		System.out.println("Area is" + getArea());

	}

}
