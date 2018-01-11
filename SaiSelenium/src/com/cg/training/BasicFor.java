package com.cg.training;
import java.util.Scanner;

public class BasicFor {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		//basecTable();
		factorial();
		

	}

	public static void factorial()
	{
		System.out.println("Enter the number: ");
		int fact = input.nextInt();
		
		int pro=1;
		for(int i=fact;i>=1;i--)
		{
			pro = pro*i;
			
		}
		System.out.println(pro);	
	}
	public static void basecTable()
	{
		
		System.out.println("Enter the table you want: ");
		int table = input.nextInt();//5

		System.out.println("Enter the Count you want: ");
		int count = input.nextInt();//10

		for(int i=1;i<=count;i++)
		{
			System.out.println(i+" * "+table+" = "+(i*table));
		}
	}

}
