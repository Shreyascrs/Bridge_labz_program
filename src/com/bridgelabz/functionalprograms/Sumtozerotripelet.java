package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Sumtozerotripelet {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the elements of array");
		//int n=scan.nextInt();
		int[] num= {0,-1,2,-3,1};
		int count=0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				for (int j2 = j+1; j2 < num.length; j2++) {
					if(num[i]+num[j]+num[j2]==0)
					{
						count++;
						System.out.println("the triplets that leads to zero are");
						System.out.println(num[i]+" "+num[j]+" "+num[j2]);
					}
				}
			}
		}System.out.println("numbver of triplets are "+count);

	}

}
