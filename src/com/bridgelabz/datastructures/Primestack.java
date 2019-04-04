package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.Utilityds.Stack;
/********************************************************************************************
 * 
 * @purpose 	:adding prime no to stack
 * @author 		:Shreyas CR
 * @version 	: 1.0
 * @since		: 02-04-2019
 * 
 ********************************************************************************************/

public class Primestack {
public static void main(String[] args) {
	Utilityds util=new Utilityds();
	Stack<Integer> stack1=util.new Stack<Integer>();
	int[] arr1=util.prime();
	int[] anag=util.checkanagaram(arr1);
	for (int i = 0; i < anag.length; i++) {
		
		stack1.push(anag[i]);
	}
	int size=stack1.size();
	for (int i = 0; i < size; i++) {
		{
		System.out.println(stack1.pop());
		}
	}
}
}
