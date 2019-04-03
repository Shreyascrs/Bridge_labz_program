package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.functionalprograms.Utilityfun;


public class Utilityalg {
///////////////////////////////////////////////anagram functions///////////////////////////////////////////////
	static Scanner scan=new Scanner(System.in);
	public static String sort(char[] ch) {
		String result="";
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					
					ch[i]=ch[j];
					ch[j]=temp;				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			result+=ch[i];
		}
		return result;
		}
	
	public static boolean checkanagram(String string1, String string2) {
		String n1=sort(string1.toCharArray());
		String n2=sort(string2.toCharArray());
		String[] anagram=new String[100];
		int k=0;
		
			if(n1.equals(n2)) 
			{
				anagram[k++]=string1;
				anagram[k++]=string2;
				return true;
			}
			else
			{
				return false;
			}
			
	}

////////////////////////////////////////////////static methods of search and sort////////////////////////////////
public static void insertionstring() {
	long starttime=Utilityfun.starttime();
	System.out.println("enter the number of elements");
	int size=scan.nextInt();
	String[] array=new String[size];
	System.out.println("enter the elements");
	for (int i = 0; i < array.length; i++) {
		array[i]=scan.next();
	}
	for (int i = 1; i < array.length; i++) {
		String temp=array[i];
		int j=i;
		while(j>0 && array[j-1].compareTo(temp)>0)
		{
			array[j]=array[j-1];
			j=j-1;
		}
		array[j]=temp;
	}
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	long stoptime=Utilityfun.stoptime();
	long estimatedtime=stoptime-starttime;
	System.out.println("the estimated time is"+estimatedtime/1000);
	
}

public static void insertioninteger() {
	long starttime=Utilityfun.starttime();
	System.out.println("enter the number of elements");
	int size=scan.nextInt();
	int[] array=new int[size];
	System.out.println("enter the elements");
	for (int i = 0; i < array.length; i++) {
		array[i]=scan.nextInt();
	}
	for (int i = 1; i < array.length; i++) {
		int temp=array[i];
		int j=i;
		while(j>0 && array[j-1]>temp)
		{
			array[j]=array[j-1];
			j=j-1;
		}
		array[j]=temp;
	}
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	long stoptime=Utilityfun.stoptime();
	long estimatedtime=stoptime-starttime;
	System.out.println("the estimated time is"+estimatedtime);
	
}

public static void bubblesortstring() {
	long starttime=Utilityfun.starttime();
	System.out.println("enter the number of elements");
	int size=scan.nextInt();
	String[] array=new String[size];
	System.out.println("enter the elements");
	for (int i = 0; i < array.length; i++) {
		array[i]=scan.next();
	}
	for (int i = 0; i < array.length-1; i++) {
		for (int j = 0; j < array.length-i-1; j++) {
			if(array[j].compareTo(array[j+1])>0)
			{
				String temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	long stoptime=Utilityfun.stoptime();
	long estimatedtime=stoptime-starttime;
	System.out.println("the estimated time is"+estimatedtime);
	
}

public static void bubblesort() {
	long starttime=Utilityfun.starttime();
	System.out.println("enter the number of elements");
	int size=scan.nextInt();
	int[] array=new int[size];
	System.out.println("enter the elements");
	for (int i = 0; i < array.length; i++) {
		array[i]=scan.nextInt();
	}
	for (int i = 0; i < array.length-1; i++) {
		for (int j = 0; j < array.length-i-1; j++) {
			if(array[j]>array[j+1])
			{
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	long stoptime=Utilityfun.stoptime();
	long estimatedtime=stoptime-starttime;
	System.out.println("the estimated time is"+estimatedtime);
}

public  static void binsearch() {
	long starttime=Utilityfun.starttime();
			String[] a=inputstring();
			Arrays.sort(a);
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			System.out.println("enter the key");
			String key=scan.next();
			int start=0;
			int end=a.length-1;
			
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				if(key.compareTo(a[mid])==0)
				{
					System.out.println("the key found "+a[mid]);
				}
				if(key.compareTo(a[mid])<0)
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
				
			}
			long stoptime=Utilityfun.stoptime();
			long estimatedtime=stoptime-starttime;
			System.out.println("the estimated time is"+estimatedtime);
			
	
}

public static String[] inputstring() {
	System.out.println("enter the size of the string array");
	int size=scan.nextInt();
			 String[] a=new String[size];
			System.out.println("enter the elements");
			for (int i = 0; i < a.length; i++) {
				a[i]=scan.next();
			}
			return a;
	
}

public static void binarysearch() {
	// TODO Auto-generated method stub
	long starttime=Utilityfun.starttime();
	System.out.println("enter the size of the array");
	int size=scan.nextInt();
			 int[] a=new int[size];
			System.out.println("enter the elements");
			for (int i = 0; i < a.length; i++) {
				a[i]=scan.nextInt();
			}
			//Arrays.sort(a);
			
			int start=0;
			int end=a.length-1;
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");	
			}System.out.println();
			System.out.println("enter the key to be searched");
			int key=scan.nextInt();
			
	
	while(start<end)
	{	
		
		
		int mid=(start+end)/2;
		if(key==a[mid])
		{
			System.out.println("the key found position is "+mid);
		}
		 if(key<=mid)
		{
			end=mid;
		}
		 else
		{
			start=mid+1;
		}
	}
	long stoptime=Utilityfun.stoptime();
	long estimatedtime=stoptime-starttime;
	System.out.println("the estimated time is"+estimatedtime);
}

//////////////////////////////////////////////////monthly payout////////////////////////////////////////////
public double payout(double P,double Y,double R)
{
double n=12*Y;
double r=R/(12*100);
double payment=P*r/1-Math.pow((1+r),-n);
return payment;
}

///////////////////////////////////////////////temperature conversion/////////////////////////////////////////
public static void celsius() {
	System.out.println("enter the temperature in celsius ");
	int cel=scan.nextInt();
	int far=(int)((cel*9/5)+32);
	System.out.println("the temperature in celsius is "+far+"F");
	
}

public static void faranite() {
	System.out.println("enter the temperature in farnite");
	int far=scan.nextInt();
	int cel=(int)((far-32)*5/9);
	System.out.println("the temperature in celsius is "+cel+"C");
}

//////////////////////////////////////////////swaping of nibbles//////////////////////////////////////////////
public static boolean poweroftwo(int result) {
	while(result!=1) {				//it iterate until the result is zero if zero the value is power of 2
		if(result%2!=0)       
		{
			return false;
		}else
		{
			result=result/2;
		}
}return true;
	
}
public static int swapnibbles(int n) {
	return ((n & 0x0F) << 4 | (n & 0xF0) >> 4); //swaps with first 4 with last 4 bits
	
}

////////////////////////////////////////////guess the number/////////////////////////////////////////////////////
public static int search(int lo, int hi) {
	// TODO Auto-generated method stub
	//Scanner scan=new Scanner(System.in);
	int x;
	if(hi-lo==1) {
		
	
		return lo;						//return value
	}
	int mid=lo+(hi-lo)/2;				// calculating mid
	System.out.println("is it less than "+mid);
	System.out.println("enter 1 or 0");
	x=scan.nextInt();
	if(x==1)											
		{
		return search(lo,mid);
		}
		else {
			return search(mid,hi);
			}
	} 

/////////////////////////////////////////////////////////day of the month////////////////////////////////////////
public static int dayincalender(int d, int m, int y) {
	int y0 =y - (14 - m) / 12;							//gives year
	int x =y0 + y0/4 - y0/100 + y0/400;					//gives prime value
	int m0 = m + 12 * ((14 - m) / 12) - 2;				//gives month
	int d0 = (d + x + (31*m0)/12) % 7;					//gives the value between 0-6
	return d0;
} 

/////////////////////////////////////////////////    merge sort/////////////////////////////////////////////////
public static void callmergesort() {
	System.out.println("enter the no elements going to enter");
	int num=scan.nextInt();
	int[] arr=new int[num];
	System.out.println(" enter the elements "); //to scan the arrray elements
	for (int i = 0; i < arr.length; i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println(" the entered array is ");
	printarray(arr);
	
	 mergesort(arr,0,arr.length-1);
	 System.out.println("the sorted array is");
	printarray(arr);
}

private static void printarray(int[] arr) {						//to print an array
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
}

public static void mergesort(int[] arr, int l, int h) {
	
	
	 if(l<h)
	 {
		int mid=(h+l)/2;
	 mergesort(arr,l,mid);                       //to divide left array
	 mergesort(arr,mid+1,h);					// to divide right array
	 merge(arr,l,mid,h);
	
	}
}

public static void merge(int[] arr, int l, int mid, int h) {
	int n1=mid-l+1;									// length for left array
	int n2=h-mid;									//length for right array
	
	int[] t1=new int[n1];						//new array for left array
	int[] t2=new int[n2];						//new array for right array
	
	int i=0,j=0;
	for (int j2 = 0; j2 < t1.length; j2++) {
		t1[j2]=arr[l+j2];						// copying data to left array
	
	}
	for (int j2 = 0; j2 < t2.length; j2++) {
		t2[j2]=arr[mid+1+j2];					// copying data to right array					
		
	}
	int k=l;
	
	while(i<n1 && j<n2)                        //loop for comparision
	{
		if(t1[i]<=t2[j])
		{
			arr[k]=t1[i];
			i++;
		}
		else
		{
			arr[k]=t2[j];
			j++;
		}
		k++;
	}
	while(i<n1)									//loop for remaining items to copy
	{
		arr[k]=t1[i];
		i++;
		k++;
	}
	while(j<n2)
	{
		arr[k]=t2[j];
		j++;
		k++;
	}
	
}


}