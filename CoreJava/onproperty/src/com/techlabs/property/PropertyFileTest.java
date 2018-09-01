package com.techlabs.property;
import java.util.*;
import java.io.*;
public class PropertyFileTest {
	public static void main(String args[]) {
		try {
			FileReader file=new FileReader("db.properties");
			Properties p=new Properties();
			p.load(file);
			System.out.println(p.getProperty("username"));
			System.out.println(p.getProperty("password"));
			
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
		
	}

}
