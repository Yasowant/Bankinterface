package com.yash;

public class ICICI implements Bank {
	private double interestRate;

	public ICICI(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interestRate;
	}

}
