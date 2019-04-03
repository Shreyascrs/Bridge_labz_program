package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Stake value");
		int $stake=scan.nextInt();
		System.out.println("enter the goal value");
		int $goal=scan.nextInt();
		System.out.println("enter the no of trails");
		int num=scan.nextInt();
		Utilityfun.gamb($stake,$goal,num);
	}

	

}
