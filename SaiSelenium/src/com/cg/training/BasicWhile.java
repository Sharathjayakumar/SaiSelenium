package com.cg.training;

import java.util.Scanner;

public class BasicWhile {

	public static void main(String[] args) {

		
		
		/*for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
		
		int i=0;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}*/
		//basecTable();
	
		
		//System.out.println("I\tJ");
		/*for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.println(i+"\t"+j);
			}
		}*/
		
		/*int i=1;
		while(i<=3)
		{
			int j=1;
			while(j<=4)
			{
				System.out.println(i+"\t"+j);
				j++;
			}
			i++;
		}*/

		/*		
		54321
		4321
		321
		21
		1
	*/

		/*for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		
/*		54321
		4321
		321
		21
		1
*/
/*		
		int i=5;
		while(i>=1)
		{
			int j=i;
			while(j>=1)
			{
				System.out.print(j);
				j--;
			}
			System.out.println();
			i--;
		}
*/		
		
		
		/*
		1
		23
		456
		78910*/
		
	/*	int sum=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)//j<=i
			{
				sum=sum+1;
				System.out.print(sum);
			}
			System.out.println();
		}*/
		
		System.out.println("Using While Loop");
		int su=0;
		int i=1;
		while(i<=4)
		{
			int j=1;
			while(j<=i)
			{
				su=su+1;
				System.out.print(su);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
	public static void basecTable()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the table you want: ");
		int table = input.nextInt();//5

		System.out.println("Enter the Count you want: ");
		int count = input.nextInt();//10

		/*for(int i=1;i<=count;i++)
		{
			System.out.println(i+" * "+table+" = "+(i*table));
		}*/
		
		int i=1;
		while(i<=count)
		{
			System.out.println(i+" * "+table+" = "+(i*table));
			i++;
		}
				
		
	}
}

