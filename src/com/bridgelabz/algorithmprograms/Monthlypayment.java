package com.bridgelabz.algorithmprograms;

public class Monthlypayment {

	public static void main(String[] args) {
		double P=Double.parseDouble(args[0]);
		double R=Double.parseDouble(args[1]);
		double Y=Double.parseDouble(args[2]);
		Utilityalg u=new Utilityalg();
		double payment=u.payout(P, Y, R);
		System.out.println("the monthely payout is "+payment);

	}

}
