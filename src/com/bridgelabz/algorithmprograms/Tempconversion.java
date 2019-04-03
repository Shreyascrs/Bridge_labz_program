package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class Tempconversion {
static 	Scanner scan=new Scanner(System.in);
public static void main(String args[])
{
	
	System.out.println("enter the 1 to faranite input or 2 to celsius input");
	int ch=scan.nextInt();
	if(ch==1)
	{
		Utilityalg.faranite();
	}
	else if(ch==2)
	{
		Utilityalg.celsius();
	}
	else
	{
		System.out.println("invalid input");
	}
}


}
