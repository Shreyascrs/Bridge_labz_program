package com.bridgelabz.algorithmprograms;

public class Gregoriancalender {

	public static void main(String[] args) {
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		
		int ch=Utilityalg.dayincalender(d,m,y);
		switch(ch)
		
		{
		case 0:
		   System.out.println("sunday");
		break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		
		}
	}

	

}
