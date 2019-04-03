package com.bridgelabz.functionalprograms;

public class Headtailpercent {
	public static void main(String[] args) {
		int head=0;
		int tail=0;
			for (int i = 0; i < 10; i++) {
			double r=Math.random();
			if(r<0.5)
			{
				tail++;
			}else
			{
				head++;
			}
		}
			percent(head,tail);
		}
		static void percent(int h,int t)
		{
			double hp=0;
			double tp=0;
		 hp=h*100/10;
		 tp=t*100/10;
		System.out.println("head percentage is="+hp);
		System.out.println("tail percentage is="+tp);
	}
}
