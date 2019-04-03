package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class Swapnibbles {
	static Scanner scan=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("enter the number");
	int n=scan.nextInt();
	int result=Utilityalg.swapnibbles(n);
	System.out.println("the swaped result is "+result);
	boolean b=Utilityalg.poweroftwo(result);
	if(b==true)
	{
		System.out.println("the number is power of two");
	}else
	{
		System.out.println("the number is not a power of two");
	}
	
	
	
	
}

}
