package com.yash;

public class SBI implements Bank {
	private double interestRate;

	public SBI(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {

		return interestRate;
	}

}
