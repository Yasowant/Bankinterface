package com.yash;

public class PNB implements Bank {
	private double interestRate;

	public PNB(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {

		return interestRate;
	}

}
