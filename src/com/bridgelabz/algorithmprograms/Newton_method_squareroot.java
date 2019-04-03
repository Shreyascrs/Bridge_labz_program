package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class Newton_method_squareroot {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	double c=scan.nextDouble();
	double epsilon=1e-15;
	double t=c;
	scan.close();
	 while (Math.abs(t - c/t) > epsilon*t) {
         t = (c/t + t) / 2.0;

	 }
	 System.out.println(t);
	}
}
