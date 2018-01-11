package com.sai.constnmethodoverload;

public class MethodOverload {
	
	public void add(int a, int b)
	{
		System.out.println("This is Two int Method");
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println("This is Three int Method:"+(a+b+c));
	}
	
	public double add(double a, int b)
	{
		System.out.println("This is one float and one int Method");
		return 0;
	}
	
	public int add(char ch1, char ch2)
	{
		System.out.println("This is Two char Method");
		return 0;
	}
}
