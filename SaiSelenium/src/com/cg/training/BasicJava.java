package com.cg.training;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicJava {

	
	//Below Code is used to define Void Keyword
	public static void add()
	{
		System.out.println("This is inside add");
		int total = getMarks();
		double avgCalc = calcAvg(total,3);		
	}
	
	public static double calcAvg(int totalMark, int NoOfSub)
	{
		double AVG = totalMark/NoOfSub;
		return AVG;
	}
	public static int getMarks()
	{
		int Tam=45, Eng=55, Mat=65;		
		return (Tam+Eng+Mat);
		
	}
	
	
	
	
	//Below code is used to understand Static Keyword
	public static void understandStatic()
	{
		System.out.println("Inside Static Method");
	}
	
	public static void main(String[] what) {
		BasicJava obj = new BasicJava();
		
		//understandStatic();
		//obj.defineString();
		//dataType();
		//operator();
		logicalOp();
		/*System.out.println("This is inside Main");
		System.out.println("This is return from Add Method: "+add());
		System.out.println("Main Progaram Completed");*/
	}
	
	//Below Code is used to define String[] Args
	public void defineString()
	{
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Enter your Name: ");
		String name = input.next();
	
		System.out.println("Enter your Age: ");
		int age = input.nextInt();
		System.out.println("Enter your Avg: ");
		double avg= input.nextDouble();
		
		//System.out.println("Your Given Value is: "+name);
		System.out.println("Your Given Value is: "+age);
		System.out.println("Your Given Value is: "+avg);
		

		String args[]={"Sarath", "Andrews","Arun", "Aliver", "Saravanan"};
		
		System.out.println("Your Total Array Length: "+args.length);
		
		System.out.println(args[1]);
		
		
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
		/*int a=14;
		System.out.println(a/3);
		System.out.println(a%3);*/
		
		//Below code is used to understand Pre and Post Incr/Decr
		/*
		int i=5;
		//i++;//i=i+1;
		System.out.println(i--);
		System.out.println(i);*/
		
	}
	
	public static void logicalOp()
	{
		
		/*String FSTName = "Sai Natarajan";
		String LSTName = "Venkataramani";
		int Age = 32;
		System.out.println(FSTName+" "+LSTName+"======>"+Age);*/
	
		System.out.println("A\tB\tA&B\tA|B");
		System.out.println("-------------------------------------------");
		/*short a=0,b=0;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b));//+ Concat Symbol
		a=0;b=1;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b));
		a=1;b=0;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b));
		a=1;b=1;
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b));
		
		*/
		
		for(int a=0;a<=1;a++)
		{
		  for(int b=0;b<=1;b++)
		   { 
			  //System.out.println(a+"\t"+b);
			  System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b));
		   }
		}
		
		//Below Code is used to understand NOT func
/*
		String s1="Hari";
		String s2="HarI";
		if(!s1.equals(s2))
		{
			System.out.println("Values are Equal");
		}
		
		System.out.println("Program Completed");
		*/
	}
	
	
	public static void dataType()
	{
		//+127 to -128
		/*byte by = 127;
		System.out.println("Byte: "+by);
	 */
		//Below Code is for short
		//+32767 to -32768
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
		
		String name = "SAI NATARAJAN";
		System.out.println(name);
		char ch = 'S';
		System.out.println(ch);
		
	}
	
}
