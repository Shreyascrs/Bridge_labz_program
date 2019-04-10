package com.bridgelabz.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Stockmain{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String pathresult="/home/admin1/Desktop/input/stockoutput.json";
	String path="/home/admin1/Desktop/input/stockinput.json";
	ObjectMapper mapper=new ObjectMapper();
	File file=new File(path);
	File file1=new File(pathresult);
	ArrayList stock=new ArrayList();
	
	try {
		JsonNode node=mapper.readTree(file);
		JsonNode value=node.findPath("stock");
		
		System.out.println(" --------------------------------- stock report -------------------------------");
		System.out.println();
		for (JsonNode nod : value) {
			String stock_name=nod.findPath("stock_name").asText();
			stock.add(stock_name);
			int no_of_stocks=nod.findPath("no_of_stocks").asInt();
			stock.add(no_of_stocks);
			int share_price=nod.findPath("share_price").asInt();
			stock.add(share_price);
			System.out.println("stock name\t\t:"+stock_name);
			System.out.println("number of shares are\t:"+no_of_stocks);
			System.out.println("each share price\t:"+share_price);
			long total_price=no_of_stocks*share_price;
			stock.add(total_price);
			mapper.writeValue(file1, stock);
			
			System.out.println("total price\t\t:"+(no_of_stocks*share_price));
			System.out.println();
			
		}
	} catch (JsonProcessingException e) {
		
		System.out.println("error occured during parsing the data from file");
	} catch (IOException e) {
		
		System.out.println("error occured during parsing the data from file");
	}
}
}
