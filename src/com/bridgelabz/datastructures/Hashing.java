package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.datastructures.Utilityds.linkedlist;

/****************************************************************************************
 * 	@purpose: Create a Slot of 10 to store Chain of Numbers that belong to each Slot to 
 * 				efficiently search a number from a given set of number
 * 	
 * 	@author  :Shreyas CR
 * 	@version : 1.0
 *	@since	 :1/04/2019
 * 
 *****************************************************************************************/

public class Hashing {
	
	@SuppressWarnings("rawtypes")
	public static  linkedlist slot[] = new linkedlist[11];

	@SuppressWarnings({ "rawtypes", "unchecked", "resource" })
	public static void main(String[] args) throws FileNotFoundException {
Utilityds util=new Utilityds();
		String path = "/home/admin1/Desktop/input/hashinput.txt";
		String path1="/home/admin1/Desktop/input/hashoutput.txt";
		
		for (int i = 0; i < 11; i++) {
			
				slot[i] =new linkedlist();
		}

		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			String str = br.readLine();

			System.out.println(str);

			String[] strA = str.split(" ");
			for (int i = 0; i < strA.length; i++) {
				int slotNum = hash(strA[i]);
				slot[slotNum].add(strA[i]);
				 System.out.print(slot[slotNum]);
			}

			System.out.println();

			for (int i = 0; i < 11; i++) {
				System.out.print(i + "==> ");
				slot[i].show();
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String to search:");
			String key = sc.nextLine();
			int slotNumber = hash(key);
			boolean value = slot[slotNumber].search(key);
			if (value) {
				System.out.println("\nElement found at slot " + slotNumber + " and deleted\n");
				slot[slotNumber].delete(key);
			} else {
				System.out.println("\nElement not found but added: " + key + " at slot " + slotNumber + "\n");
				slot[slotNumber].add(key);
			}

			System.out.println();
			for (int i = 0; i < 11; i++) {
				System.out.print(i + "==> ");
				slot[i].show();
			}

			String s = "";
			for (int i = 0; i < 11; i++) {
				s = s + (slot[i]);
				System.out.println(s.toString());
			}
			System.out.println("New elements in file:\n" + s);
			BufferedWriter bw = new BufferedWriter(new FileWriter(path1));
			bw.write(s);
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static int hash(String str) {
		int index = Integer.parseInt(str) % 11;

		return index;
	}

}

