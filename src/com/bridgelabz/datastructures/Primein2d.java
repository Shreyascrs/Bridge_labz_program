package com.bridgelabz.datastructures;

import com.bridgelabz.algorithmprograms.Utilityalg;

/****************************************************************************************
 * 	@purpose:Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
 * 			 Store the prime numbers in a 2D Array
 * 	
 * 	@author  :Shreyas CR
 * 	@version : 1.0
 *	@since	 :2/04/2019
 * 
 *****************************************************************************************/

public class Primein2d {
	
		
		public static void main(String[] args) {
			Utilityds util=new Utilityds();
			
			
			int[] arr1=util.prime();
			
			int[][] arr2=new int[10][167];
			
			System.out.println("the prime in 2D array ");

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 167; j++) {
					if (arr1[j] > ((i) * 100) && arr1[j] < ((i + 1) * 100)) {
					{
						arr2[i][j]=arr1[j];
					System.out.print(arr2[i][j]+" ");
						
					}
					
					}
				}System.out.println();

			}
			System.out.println("the anagrams are ");
			int[] anag=util.checkanagaram(arr1);
			for (int i = 0; i < anag.length; i++) {
				System.out.print(anag[i]+" ");
			}
		}
	}


