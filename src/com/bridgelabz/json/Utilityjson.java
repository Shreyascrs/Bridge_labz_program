package com.bridgelabz.json;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Utilityjson {
	static ObjectMapper mapper;
	static {
		mapper=new ObjectMapper();
	}
	public static String javatojson(Object object)
	{
		String jsonResult="";
		try {
			jsonResult=mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonResult;
	}
	public static <T> T jsontojava(String json,Class<T> cls) {
		T result=null;
		try {
			result=mapper.readValue(json, cls);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			System.out.println("error while converting json to java");
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			System.out.println("error while converting json to java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error while converting json to java");
		}
		return result;
	}
}
