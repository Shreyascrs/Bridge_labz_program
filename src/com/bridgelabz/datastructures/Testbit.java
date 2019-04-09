package com.bridgelabz.datastructures;

public class Testbit {
public static void main(String[] args) {
	String s="010110110";
			for (int i = 1; i < s.length()-1; i++) {
				if(s.charAt(i-1)=='0'&&s.charAt(i)=='1'&&s.charAt(i+1)=='1')
				{
					System.out.println("the position is "+i);
				}
			}
}
}
