package com.in.code.com;

import java.util.ArrayList;
import java.util.List;

public class ArrayReader 
{


	public static void run()
	{
		List<String> a1 = new ArrayList();
		a1.add("Dpple");
		a1.add("Ford");
		a1.add("Money");
		a1.add("Kicks");
		a1.add("Vlog");
		a1.add("India");
		
		if(a1.contains("India"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		Tin(a1);
	}
	
	
	public static void Tin(List<String> s1)
	{
		System.out.println(s1);
		
	}
	
	
	public static int cal()
	{
		int a=5;
		int b=4;
		int c = a+b;
		return c;
	}
	
	
	
	public static void reverse()
	{
		String io = "India";
		char[] ko =io.toCharArray();
		
		
		int p =ko.length;
		System.out.println(p);
		
		
		for(int i=ko.length-1;i>=0;i--)
		
			System.out.println(ko[i]);
		
		
		
	}
	
	
	
	
	
	public static void main(String args[])
	{
		ArrayReader io = new ArrayReader();
		io.run();
		io.reverse();
		

		
	}
	
	
	
}
