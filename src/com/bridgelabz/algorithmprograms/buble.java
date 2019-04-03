package com.bridgelabz.algorithmprograms;

public class buble {
public static void main(String[] args) {
	int[] num= {8,4,3,5,2,1};
	for (int i = 0; i < num.length; i++) {
		for (int j = 0; j < num.length-1; j++) {
			if(num[j]>num[j+1])
			{
				int temp=num[j];
				num[j]=num[j+1];
				num[j+1]=temp;
				
			}
		}
	}
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
}
}
