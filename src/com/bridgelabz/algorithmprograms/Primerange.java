package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class Primerange {

	public static void main(String[] args) {
		
		int n=1000;
		int count=0;
		
		for (int i = 2; i <= n; i++) {
			count=0;
			for (int j = 2; j < n; j++) {
				if(i%j==0)
				{
					count++;
				}
				
			}
			if (count==1)
			{	
				System.out.println(i);
			}
		}
	}

}
