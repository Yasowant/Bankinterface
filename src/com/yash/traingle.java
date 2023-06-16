package com.yash;

public class traingle implements Shape {
	double base;
	double height;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 1 / 2 * base * height;
	}

	@Override
	public void printInfo() {
		System.out.println("Base is: " + base);
		System.out.println("Heightis " + height);
		System.out.println("Area is" + getArea());

	}

}
