package com.bridgelabz.functionalprograms;

public class Windchill {
public static void main(String[] args)
{
	
	double t=Double.parseDouble(args[0]);
	double v=Double.parseDouble(args[1]);
	double w;
	if(t<50 && (v>3 && v<120))
	{
		w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		System.out.println(w);
	}
	else
	{
		System.out.println("invalid input");
	}
	
}
}
