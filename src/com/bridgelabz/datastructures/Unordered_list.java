package com.bridgelabz.datastructures;



import java.util.Scanner;

/********************************************************************************************
 * 
 * @purpose 	:unorderd list
 * @author 		:Shreyas CR
 * @version 	: 1.0
 * @since		: 02-04-2019
 * 
 ********************************************************************************************/

public class Unordered_list {
	
@SuppressWarnings("unchecked")
public static void main(String[] args)
{	
	Scanner scan=new Scanner(System.in);
	boolean check;
	
	String address="/home/admin1/Desktop/unlistinput.txt";//address to create a file
	 String address1="/home/admin1/Desktop/unlistoutput1.txt";
	Utilityds util=new Utilityds();							//object to invoke linkedlist object
	String data=util.ll.readfile(address);						//method to read data from file
	data=data.trim();										//to remove the empty spaces
	String[] input=data.split(" ");							//to get the words
	for (int i = 0; i < input.length; i++) {
		util.ll.add(input[i]);								//adding words to linked list
	}
		util.ll.show();										//displaying linked list
		System.out.println("enter the key to search");
		String key=scan.nextLine();							//requesting for a word
		check=util.ll.search(key);								//method to check wethwe the word is present or not
		
		if(check==true)
		{
		util.ll.delete(key);									//if it present it must be deleted
			
		}
		else
		{
		util.ll.add(key);									//if it not exist it must be added
		}
		
		util.ll.show();						         		//displaying the final result
		scan.close();
		util.ll.file(address1);
}

}


