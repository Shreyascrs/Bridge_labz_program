package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Coupon {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of coupens");
		int n=scan.nextInt();
        boolean[] isCollected = new boolean[n];  
        int count = 0;                           
        int distinct = 0;                        
  
 
        while (distinct < n) {
            int value = (int) (Math.random() * n);
            count++;                                 
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
	}
}
        for (boolean b : isCollected) {
			System.out.println(b);
		}
        System.out.println(count);
}
}