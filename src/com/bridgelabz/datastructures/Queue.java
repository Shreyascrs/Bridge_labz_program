package com.bridgelabz.datastructures;

import java.util.Scanner;

public class Queue {
public static void main(String[] args) {
	
	Utilityds util=new Utilityds();
	int balance=0;
	int deposit;
	int wd=0;
	int ch;
	int n=0;
	int people=0;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("welcome to bank");
	System.out.println("enter no of people in queue");
	n=scan.nextInt();
	while(n>0)
	{
	System.out.println("enter 1 to deposit 0 to withdraw");
	ch=scan.nextInt();
	switch(ch)
	{
	case 1:
			System.out.println("enter the deposit amount");
			deposit=scan.nextInt();
			balance+=deposit;
			util.queue.enqueue(people++);
			System.out.println("the amount in bank is "+balance);
			n--;
			break;
	case 0:System.out.println("enter amount to withdraw ");
			wd=scan.nextInt();
			balance-=wd;
			util.queue.dequeue();
			n--;
			System.out.println("the amount in bank is "+balance);
			break;
	default:System.out.println("enter valid number");
	
	}
	scan.close();
	
	}
}
}
