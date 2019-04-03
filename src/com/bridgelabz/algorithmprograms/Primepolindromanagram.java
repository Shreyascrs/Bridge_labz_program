package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Primepolindromanagram {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> ap=new ArrayList<Integer>();
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
		int pp=0;
		Primepolindromanagram p=new Primepolindromanagram();
		if (count==1)
		{	
			al.add(i);
			pp=p.polidrome(i);
		}
		if(pp>0)
		{
			ap.add(pp);
		}
		
	}
	System.out.println("the prime is");
	System.out.println(al);
	System.out.println("the prime taht is polindrome is");
	System.out.println(ap);
	System.out.println("the anagrams are");
	
	for (int i = 0; i < al.size()-1; i++) {
		for (int j = i+1; j < al.size(); j++) {
			if(Utilityalg.checkanagram(Integer.toString(al.get(i)),Integer.toString(al.get(j))))
			{
				System.out.println(al.get(i)+" "+al.get(j));
			}
			
		}
		
	}
	
}

public  int polidrome(int i) {
	
	int rev=0;
	
	int rem;
	int num=i;
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(i==rev)
	{
		return i;
	}
	else
	{
		return -1;
	}
}
}