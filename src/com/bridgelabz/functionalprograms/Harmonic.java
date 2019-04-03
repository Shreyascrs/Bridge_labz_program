package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter tha number");
		double num=scan.nextDouble();
		if(num>0)
		{
		double res=Utilityfun.Harmoniccsum(num);
		System.out.println("the sum is "+res);
		}else
		{
			System.out.println("number must be grater than 0");	
		}
		
		}
	

}
