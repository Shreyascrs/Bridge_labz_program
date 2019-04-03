package com.bridgelabz.datastructures;

import java.util.Scanner;

/****************************************************************************************
 * 	@purpose:A palindrome is a string that reads the same forward and backward, 
 * 		for example, radar, toot, and madam. We would like to construct an algorithm to i
 * 		nput a string of characters and check whether it is a palindrome.
 * 	
 * 	@author  :Shreyas CR
 * 	@version : 1.0
 *	@since	 :3/04/2019
 * 
 *****************************************************************************************/
	

public class Polidromechecker {
	public static void main(String[] args) {
		
		Utilityds util=new Utilityds();			//creating utility class object
		Scanner scan=new Scanner(System.in);	//to scan input data
		System.out.println("enter the string");
		String input=scan.next();		
		char[] data=new char[input.length()];		//variable for convertion from string to charecters
		for (int i = 0; i < input.length(); i++) {	//loop to copy the charecters
			data[i]=input.charAt(i);
		}
		for (int i = 0; i < data.length; i++) { 	//loop to add the data to deque
			util.deq.addrear(data[i]);
		}
			util.deq.print();
			boolean check=util.deq.polindrome();	//to check wether the given string is polindrome or not
			if(check==true)
			{
				System.out.println("the string is polindrome");
			}else
			{
				System.out.println("the string is not polindrome");
			}
			scan.close();
	}
}
