package com.sai.ArraysActionsWait;



import java.util.Scanner;

public class FindingBiggest {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int ArraySize = input.nextInt();
		
		int ArrVal[]=new int[ArraySize];//Declare an Array

		for(int inp=0;inp<ArraySize;inp++)
		{
			System.out.print("ArrVal["+inp+"]===>");
			ArrVal[inp] = input.nextInt();
			System.out.println();
		}

		for(int i=0;i<ArraySize;i++)
		{
			for(int j=i+1;j<ArraySize;j++)
			{
				if(ArrVal[i]<ArrVal[j])
				{
					int temp = ArrVal[i];
					ArrVal[i] = ArrVal[j];
					ArrVal[j] = temp;
				}
			}
		}
		
		System.out.println("After Sorted");
		
		for(int k=0;k<ArraySize;k++)
		{
			System.out.println(ArrVal[k]);
		}
		
		System.out.println("Smallest No: "+ArrVal[ArraySize-1]);
		System.out.println("Biggest No: "+ArrVal[0]);
	}
}
