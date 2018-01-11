package com.study.java;

import java.util.Scanner;

public class BasicJava {

	//Below Code is used to define Void Keyword
	public static String add()
	{
		System.out.println("This is inside add");
		return "sai";
	}
	
	public static void main(String hari[]) {
		BasicJava obj = new BasicJava();
		//obj.defineString();
		//dataType();
		//operator();
		logicalOp();
		/*System.out.println("This is inside Main");
		System.out.println("This is return from Add Method: "+add());
		System.out.println("Main Progaram Completed");*/
	}
	
	//Below Code is used to define String[] Args
	public  void defineString()
	{
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Enter your Name: ");
		String name = input.next();
	
		System.out.println("Enter your Age: ");
		int age = input.nextInt();
		System.out.println("Enter your Avg: ");
		double avg= input.nextDouble();
		
		System.out.println("Your Given Value is: "+name);
		System.out.println("Your Given Value is: "+age);
		System.out.println("Your Given Value is: "+avg);
		

		String names[]={"Sarath", "Andrews","Arun", "Aliver"};
		
		System.out.println("Your Total Array Length: "+names.length);
		
		System.out.println(names[0]);
		
		
	}

	public static void operator()
	{
		//Below code is used to understand about shorthand operator
		/*int a=10;
		a+=10;//a=a+10
		
		int x=5;
		x*=5;//x=x*5;
		System.out.println(a);
		System.out.println(x);*/
		
		//Below code is used to understand about mod operator
		/*int a=12;
		System.out.println(a/3);
		System.out.println(a%3);*/
		
		//Below code is used to understand Pre and Post Incr/Decr
		
		/*int i=5;
		i++;//i=i+1;
		System.out.println(i--);
		System.out.println(i);*/
		
	}
	
	public static void logicalOp()
	{
		
		/*String FSTName = "Sai Natarajan";
		String LSTName = "Venkataramani";
		int Age = 32;
		System.out.println(FSTName+' '+LSTName+"======>"+Age);
	*/
		System.out.println("A\tB\tA&B\tA|B");
		System.out.println("-------------------------------------------");
		short a=0,b=0;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b));
		a=0;b=1;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b));
		a=1;b=0;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b));
		a=1;b=1;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b));
		
		/*String s1="Sai natarajan";
		String s2="Sai Natarajan";
		if(s1==s2)
		{
			System.out.println("Inside If");
		}*/
	
		/*Scanner input = new Scanner(System.in);
		String aa = input.next();
		String bb = input.next();
		if(aa.equals(bb))
		{
			System.out.println("User Input");
		}
		
		int z=10,y=10;
		if(y==z)
		{
			System.out.println("Inside If Int");
		}*/
	}
	
	
	public static void dataType()
	{
		//+127 to -128
		/*byte by = -127;
		System.out.println(by);*/
	
		//Below Code is for short
		/*for(short i=1;i>0;i++)
		{
			System.out.println(i);
		}*/
		
		/*for(short i=0;i<1;i--)
		{
			System.out.println(i);
		}*/
		
		/*for(int i=1;i>0;i++)
		{
			System.out.println(i);
		}*/
		
		boolean flag = false;
		System.out.println(flag);
		
		String name = "SAI";
		System.out.println(name);
		char ch = 'S';
		System.out.println(ch);
				
		Scanner input = new Scanner(System.in);		
	
		System.out.println("Enter your Age: ");
		int age = input.nextInt();	
	}
	
}
