package com.yash;

public class HDFC implements Bank {
	private double interestRate;

	public HDFC(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {

		return interestRate;
	}

}
