package com.yash;

public class MainRunner {

	public static void main(String[] args) {

		Shape[] shapes = { new Circle(5.6), new Square(7.5), new Rectangle(5.2, 5.9), new Circle(3), new traingle(),
				new Square(5.9) };
		Shape bigs = getBiggestAreaShape(shapes);
		System.out.println("Area is:" + bigs.getArea());
		bigs.printInfo();

	}

	static Shape getBiggestAreaShape(Shape[] sh) {
		Shape big = sh[0];
		for (int i = 1; i < sh.length; i++) {
			if (sh[i].getArea() > big.getArea()) {
				big = sh[i];
			}
		}
		return big;
	}

}
