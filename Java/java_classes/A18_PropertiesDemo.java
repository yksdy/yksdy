import java.util.*;
import java.io.*;
public class A18_PropertiesDemo{
	public static void main(String[] args){

		//Properties,	getProperty,	setProperty,	store,	load
		Properties pro = new Properties();
		pro.setProperty("A","Apple");
		pro.setProperty("B","Banana");
		System.out.println(" exist A: "+pro.getProperty("A"));
		System.out.println(" not exist C: "+pro.getProperty("C"));
		System.out.println(" not exist D: "+pro.getProperty("D","not exist"));
		
		Properties pro1= new Properties();
		Properties pro2= new Properties();
		try{
			pro.store(new FileOutputStream(new File("abc.txt")),"abc println from Properties");
			pro.store(new FileOutputStream(new File("abc.xml")),"abc println from Properties");
			//load
		//Properties pro1= new Properties().load(new FileInputStream(new File("abc.txt")));	//Error
		//Properties pro1= new Properties();  //erroe
		pro1.load(new FileInputStream(new File("abc.txt")));	
		pro2.load(new FileInputStream(new File("abc.xml")));
			}catch(Exception e){}
		
		System.out.println("\ntxt exist A: "+ pro1.getProperty("A"));
		System.out.println("  exist C: "+ pro1.getProperty("C"));
		System.out.println("  exist B: "+ pro1.getProperty("B"));

		System.out.println("\nxml exist A: "+ pro2.getProperty("A"));
		System.out.println("  exist C: "+ pro2.getProperty("C"));
		System.out.println("  exist B: "+ pro2.getProperty("B"));
		
	}
}
