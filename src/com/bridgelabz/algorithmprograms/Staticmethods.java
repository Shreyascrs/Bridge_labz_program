package com.bridgelabz.algorithmprograms;


import java.util.Scanner;

public class Staticmethods {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice;
		System.out.println(" 1 to binarySearch method for integer" );
		System.out.println(" 2 to binarySearch method for String" );
		System.out.println(" 3 to insertionSort method for integer");
		System.out.println(" 4 to insertionSort method for string");
		System.out.println(" 5 to bubbleSort method for integer");
		System.out.println(" 6 to bubbleSort method for string");
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			Utilityalg.binarysearch();
				break;
		case 2:
			Utilityalg.binsearch();
				break;
		case 3:
			Utilityalg.insertioninteger();
				break;
		case 4:
			Utilityalg.insertionstring();
				break;
		case 5:
			Utilityalg.bubblesort();
				break;
		case 6:
			Utilityalg.bubblesortstring();
		default:
			System.out.println("invalid selection");
			
		}
	}

	
	
	
}
