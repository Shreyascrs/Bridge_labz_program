package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class GuessNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n ");
		int n=sc.nextInt();
		int num=(int)Math.pow(2, n);
		int secret=Utilityalg.search(0,num);
		System.out.println(secret);
		sc.close();
	}

	
					
		
	}

