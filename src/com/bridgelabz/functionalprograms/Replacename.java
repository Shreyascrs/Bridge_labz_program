package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Replacename {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the user name must be grater than 3 letters");
		String un=scan.nextLine();
		un=un.trim();
		if(un.length()>3)
		{		
		System.out.println("hello "+un+", How are you?");
		}
		else
		{
			System.out.println("user name is not valid");
		}
			scan.close();
	}	
}