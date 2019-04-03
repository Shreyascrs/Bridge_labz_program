package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year");
		int year=scan.nextInt();
		int length=String.valueOf(year).length();
		if(length==4)
		{
		leap(year);
		}
		else
		{
			System.out.println("invalid input");
		}
	}
	public static void leap(int y)
	{
		if((y%400==0)||(y%4==0)&&(y%100!=0))
		{	
			System.out.println(y+" is the leap year");
		}
		else
		{
			System.out.println(y+" is not a leap year");
		}
	}
}
