package com.sai.ArraysActionsWait;

import java.util.Scanner;

public class ReadArrayValue {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int ArraySize = input.nextInt();
		
		int ArrVal[]=new int[ArraySize];//Declare an Array

		for(int i=0;i<ArraySize;i++)
		{
			System.out.print("ArrVal["+i+"]===>");
			ArrVal[i] = input.nextInt();
			System.out.println();
		}
		
		
		System.out.println("These are the values you have entered");
		
		for(int j=0;j<ArraySize;j++)
		{
			System.out.println(ArrVal[j]);
		}
		
		System.out.println("Enter the Name: ");
		
		String names[] = new String[ArraySize];
		for(int k=0;k<ArraySize;k++)
		{
			System.out.print("names["+k+"]===>");
			names[k] = input.next();
			System.out.println();
		}
		
		for(int l=0;l<ArraySize;l++)
		{
			System.out.println(names[l]);
		}
		
	}

}
