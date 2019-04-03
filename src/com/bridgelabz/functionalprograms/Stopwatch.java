package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Stopwatch {
static long starttime;
static long stoptime;

 

public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	Stopwatch sw=new Stopwatch();
	System.out.println("enter 1 to start the time");
	scan.nextInt();
	starttime=Utilityfun.starttime();
	System.out.println("enter 2 to start the time");
	scan.nextInt();
	stoptime=Utilityfun.stoptime();
	scan.close();
	System.out.println("elapsed time is");
	System.out.println((sw.stoptime-sw.starttime)/1000);
}

}
