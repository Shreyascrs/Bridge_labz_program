package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
/****************************************************************************************
 * 	@purpose:Read .a List of Numbers from a file and arrange it ascending Order in a 
 * 			Linked List. Take user input for a number, if found then pop the number 
 * 			out of the list else insert the number in appropriate position
 
 * 	
 * 	@author  :Shreyas CR
 * 	@version : 1.0
 *	@since	 :1/04/2019
 * 
 *****************************************************************************************/
public class Ordered_list {
 @SuppressWarnings("unchecked")
public static void main(String[] args) {
	 Utilityds util=new Utilityds();
	 Scanner scan=new Scanner(System.in);
	 boolean check;
	 String address="/home/admin1/Desktop/input/unorderinput.txt";
	 String address1="/home/admin1/Desktop/input/unorderoutput.txt";
	 String data="";

		try {
		 FileReader fr=new FileReader(address);
		BufferedReader br=new BufferedReader(fr); 
		String line=br.readLine();					//to read a whole line
		while(line != null)
		{
			data+=line;
			line=br.readLine();
		}
		br.close();
		fr.close();
		}
		
		
		catch(Exception e)
		{
			System.out.println("exception catched in catch");
		}
		
		String[] num=data.split(" ");
//		Arrays.sort(num);
		
		
		for (int i = 0; i < num.length; i++) {
			util.ll.add(num[i]);
		}
		System.out.println("the elements in the list are");
		util.ll.show();
		System.out.println("enter key to search");
		String key=scan.next();
		check=util.ll.search(key);
		
		if(check==true)
		{
		util.ll.delete(key);									//if it present it must be deleted
			
		}
		else
		{
		util.ll.add(key);									//if it not exist it must be added
		}
		util.ll.show();
		
//		try
//		{
//			File file=new File(address1);
//		FileWriter fw=new FileWriter(file,true);
//				
//		 BufferedWriter r=new BufferedWriter(fw);
//		 
//		 
//			printtofile();
//		
//		 r.write(num[j]);
//		 r.newLine();
//		 r.flush();
//		
//		
//		 r.close();
//		 fw.close();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
// 
	scan.close();
		util.ll.file(address1);
		
 }
 
}
