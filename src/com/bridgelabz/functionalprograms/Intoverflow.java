package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Intoverflow {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of N must be grater than 0 and less than 31");
		int n=scan.nextInt();
		int sum=0;
		if(n>0 && n<31)
		{
			sum=sumis(n);
		}
		else
		{
			System.out.println("number is not in the range");
			return;
		}
		leap(sum);

	}
	public static int sumis(int n)
	{
		int s=1;
		for (int i = 1; i <=n; i++) {
			s=s*2;
		}
		System.out.println("the sum is "+s);
		return s;
	}
	public static void leap(int year)
	{
		if((year%400==0)||(year%4==0)&&(year%100!=0))
		{
			System.out.println("the year is leap year");
		}else
		{
			System.out.println("the year is not a leap year");
		}
	}
}
