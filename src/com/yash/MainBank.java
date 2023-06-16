package com.yash;

import java.util.ArrayList;
import java.util.List;

public class MainBank {

	public static void main(String[] args) {

		ArrayList<Bank> bank = new ArrayList<>();
		bank.add(new SBI(7.5));
		bank.add(new PNB(7.8));
		bank.add(new HDFC(8));
		bank.add(new ICICI(8.2));
		Bank lowInterestRateBank = getBankWithLowInterestRate(bank);
		System.out.println("Lowest Interest Rate is = " + lowInterestRateBank.getInterestRate());

		if (lowInterestRateBank instanceof SBI) {
			System.out.println("SBI has the lowest interest rate.");
		} else if (lowInterestRateBank instanceof PNB) {
			System.out.println("PNB has the lowest interest rate.");
		} else if (lowInterestRateBank instanceof HDFC) {
			System.out.println(" HDFC has the lowest interest rate.");
		} else if (lowInterestRateBank instanceof ICICI) {
			System.out.println("ICICI has the lowest interest rate.");
		}

	}

	static Bank getBankWithLowInterestRate(List<Bank> banks) {
		Bank low = banks.get(0);
		for (int i = 1; i < banks.size(); i++) {
			Bank b1 = banks.get(i);
			if (b1.getInterestRate() < low.getInterestRate())
				;
		}
		return low;

	}

}
