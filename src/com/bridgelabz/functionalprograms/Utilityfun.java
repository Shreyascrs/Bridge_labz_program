package com.bridgelabz.functionalprograms;

public class Utilityfun {
	/////////////////////////////////////////gambler///////////////////////////////
public static void gamb(int $stake, int $goal, int num) {
		
		int win=0;
		
		
		int i=0;
		for ( i = 0; i < num; i++) {						// to play games n number of times
			int cash=$stake;
			while(cash>0 && cash<=$goal)				// to complete one game cash must be 0 or must reach the goal
			{
				
				if(Math.random() > 0.5)
				{
					
					cash++;								//won the current game cash to be added
				}else
				{
					
					cash--;								//lost the game so bets cash is removed
				}
			}
			if(cash>=$goal)
			{
				win++;
			}
		}System.out.println("win percentage is "+win*100/num);
		
		
	}
//////////////////////////////////////////harmonic//////////////////////////////////////////////////////////////
public static double Harmoniccsum(double num) {
	double sum=0;
	for (int i = 1; i <=num; i++) {					//iteration to get the numbers
		sum+=(1.0/i);							
	}
	return sum;
}
////////////////////////////////////prime factor//////////////////////////////////////////////////////////////
public static void primefact(int n) {
	// TODO Auto-generated method stub
	for (int i = 2; i <=n; i++) {   
		if(n%i==0) {      //to check the number
		while(n%i==0)    //to find the factor
		{
			n=n/i;
			System.out.println(i+" ");
		}
		}		
}
}
//////////////////////////////////////start stop time////////////////////////////////////////////////////
public static long starttime()							//to start a time 
{
	
	return System.currentTimeMillis();
}
public static long stoptime()							//to stop the time
{
	
	return System.currentTimeMillis();
}
}