package com.bridgelabz.functionalprograms;

import java.util.Scanner;
import java.util.TreeSet;

public class Coupon2 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<Integer>();
		System.out.println("enter the no of coupens");
		int n=scan.nextInt();
        //boolean[] isCollected = new boolean[n];  
        int count = 0;                           
        int distinct = 0;                        
  
 
        while (distinct < n) {
            int value = (int) (Math.random() * n*Math.random()+n/2+n%2);
            
            count++;                                 
            if (ts.add(value)==true) {
                distinct++;
                
	}
}
        System.out.println(count);
        
        
}
}