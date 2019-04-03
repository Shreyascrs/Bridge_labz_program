/**
 Purpose : 
 @author : 
 @version :1.2
 @date :
   
 */
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class anagram {
public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	String string1="abcd";
	String string2="dcba";
	
	
	
		
		if(Utilityalg.checkanagram(string1,string2))
		{
			System.out.println("anagram");
		
		}
		else
		{
			System.out.println("not anagram");
		}
	
}




}
