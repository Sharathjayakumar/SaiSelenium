package com.study.java;

import java.util.Scanner;

public class DiffLoops {

	public static void main(String[] args) {

		/*
		 4444
		 333
		 22
		 1 

		 */


		/*for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/

		/*System.out.println("Below Script Executed through do while loop");
		int x=4;
		do
		{
			int y=1;
			do
			{
				System.out.print(x);
				y++;
			}
			while(y<=x);
			System.out.println();
			x--;
		}
		while(x>=1);*/


		basicTable();

		/*
		for(int i=0;i<=10;i++)
		{
		System.out.println("Hello");
		break;
		}


		int j=1;
		while(true)
		{
			if(j==10)
			{
				break;
			}
			System.out.println(j++);

		}
		 */	}



	public static void basicTable()
	{
		Scanner input = new Scanner(System.in);

		String UserChoice;
		do
		{
			System.out.println("Enter the table you want: ");
			int table = input.nextInt();//5

			System.out.println("Enter the Count you want: ");
			int count = input.nextInt();//10

			int i=1;
			do
			{
				System.out.println(i+" * "+table+" = "+(i*table));
				i++;
			}
			while(i<=count);
			do
			{
				System.out.println("Do you want to continue\nIf yes press 'Y' else press 'N'");
				UserChoice = input.next();
				
				if(!(UserChoice.equals("Y") | UserChoice.equals("y") | UserChoice.equals("N") | UserChoice.equals("n")))
				{
					System.out.println("Please choose the proper options given");
				}
			}
			while(!(UserChoice.equals("Y") | UserChoice.equals("y") | UserChoice.equals("N") | UserChoice.equals("n")));	
		}
		while(UserChoice.equalsIgnoreCase("Y"));
		//while(UserChoice.equals("Y") | UserChoice.equals("y"));
	}

}
