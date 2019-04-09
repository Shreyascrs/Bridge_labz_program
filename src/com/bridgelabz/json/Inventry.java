package com.bridgelabz.json;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
/*
 * @auther	:Shreyas CR
 * @version	:jackson 1x
 * @date	:09/04/2019
 */
@SuppressWarnings("serial")
public class Inventry implements Serializable {
public static void main(String[] args)  {
	Scanner scan=new Scanner(System.in);		
							
	String path="/home/admin1/Desktop/input/jsoninput.json";	// source file path contain json data
	ObjectMapper mapper=new ObjectMapper();						// creation of object mapper reference
	File file=new File(path);									// for file reference 
	int choice=0;												// for choice in selection of inventry

	
	try {
		JsonNode jsondata=mapper.readTree(file);				// reading data of json in tree structure

		do {
			System.out.println("enter your choice");			
			System.out.println("1 for rice   2 for pulses   3 for wheat");
			try {
			choice=scan.nextInt();								// reading the choice input
			}
			catch(Exception e)
			{
				System.out.println("type missmatch ");			
			}
		}while(choice<0 || choice>4);
		
		String inventryproduct="";								// the string which has choice data
		
		
		switch(choice)
		{
		case 1:
			inventryproduct="Rice";
			break;
			
		case 2:
			inventryproduct="Pulses";
			break;
			
		case 3:
			inventryproduct="Wheat";
			break;
			default:
				System.out.println("invalid input");
				break;
		}
		
		JsonNode inventry = jsondata.findPath(inventryproduct);		// searching for specific data
		System.out.println(" --------------------------------- "+inventryproduct+" -------------------------------");
		System.out.println();
		for (JsonNode node : inventry) {
			String name=node.findPath("name").asText();				// accessing name value 
			int weight=node.findPath("weight").asInt();				// accessing weight value
			int price=node.findPath("price").asInt();				// accessing price value
			
			System.out.println("name\t:"+name+"\nprice\t:"+price+"\nweight\t:"+weight);//printing the accessed value
			System.out.println();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("error occured while parsing a file");
	}
	scan.close();
	}
}