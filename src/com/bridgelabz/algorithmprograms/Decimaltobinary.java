package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class Decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=0;
		int k=0;
		int one=0;
		int count=0;
		int[] binary=new int[100];
		System.out.println("enter the decimal no");
		int num=scan.nextInt();
		int number=num;
		while(num!=0)
		{
			binary[i]=num%2;
			num=num/2;
			i++;
		}
		for (int j = i-1; j >=0; j--) {
			System.out.print(binary[j]);
			if(binary[j]==1)
			{one++;
			count=count+1;
			}
			else
			{
			count=count+1;
			}
			
		}System.out.println();
		System.out.print(number+"=");
	
		k=count;
		for (int j = k; j>=0 ; j--) {
			
			if(binary[j]==1)
			{
				if(one!=1)
				{one--;
				System.out.print((int)Math.pow(2, count)+"+");
				count--;
				
				}else
				{
					System.out.print((int)Math.pow(2, count));
					count--;
				}
			}
			else
			{
				count--;
			}
			
			
		}
		
	}

}
