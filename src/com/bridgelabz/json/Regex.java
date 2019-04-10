package com.bridgelabz.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// the another class is Userinput.java
public class Regex {
	
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		Userinput input=new Userinput();
		String path="/home/admin1/Desktop/input/regexinput.txt";
		File file=new File(path);
		String data="";
		
		BufferedReader reader=new BufferedReader(new FileReader(file));
		String temp="";
		while((temp=reader.readLine())!=null) {
		data+=temp;
		}
		System.out.println(data);
		System.out.println("enter the first name");
		input.setFirstname(scan.next());
		System.out.println("enter the last name");
		input.setLastname(scan.next());
		System.out.println("enter the mobile number");
		input.setMobileno(scan.next());
		System.out.println("enter the date");
		input.setDate(scan.next());

		
		String message = convertstring(input,data);
		System.out.println(message);
		
	}
	public static String convertstring(Userinput input,String data) {
		
		Pattern p=Pattern.compile("<<name>>");
		Matcher m=p.matcher(data);
		data=m.replaceAll(input.getFirstname());
		
		p=Pattern.compile("<<full name>>");
		m=p.matcher(data);
		data=m.replaceAll(input.getFirstname()+" "+input.getLastname());
		
		p=Pattern.compile("xxxxxxxxxx");
		m=p.matcher(data);
		data=m.replaceAll(input.getMobileno());
		
		p=Pattern.compile("01/01/2016");
		m=p.matcher(data);
		data=m.replaceAll(input.getDate());
		
		return data;
	}

}
