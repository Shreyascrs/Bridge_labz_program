package com.bridgelabz.functionalprograms;

import java.io.PrintWriter;
import java.util.Scanner;

public class twoprog {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out); 
		System.out.println("enter no of rows and columns");
		int m=scan.nextInt();
		int n=scan.nextInt();
		System.out.println("enter the elements of array");
		int [][] num=new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				num[i][j]=scan.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print(num[i][j]+" ");
				pw.flush();
			}System.out.println();
		}

	}

}
