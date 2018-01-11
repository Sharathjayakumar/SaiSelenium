package com.sai.constnmethodoverload;


public class DemoConstrctor {
	
	static int age;
	static String name;
	public void normalMethod()
	{
		System.out.println("This is normal Method");
	}
	
	public void printValues()
	{
		System.out.println("Age is: "+this.age);
		System.out.println("Name is: "+this.name);
	}
	
	public DemoConstrctor()
	{
	System.out.println("This is null constructor");	
	}
	
	public DemoConstrctor(int age)
	{
		this.age = age;	
		//age=this.age // Null value
		
	}
	
	public DemoConstrctor(String name)
	{
		this.name=name;
	}
}
