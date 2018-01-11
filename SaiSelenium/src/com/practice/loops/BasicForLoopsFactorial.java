package com.practice.loops;

import java.util.Scanner;

public class BasicForLoopsFactorial {
	
	public static void Factorial()
	{
		Scanner factorial = new Scanner(System.in);
		
		System.out.println("Enter the Factorial Number:");
		int a = factorial.nextInt();
		
		int pro =1;
		
		for(int i=a;i>=1;i--) {
			
			pro=pro*i;
		}
		
		System.out.println(pro);
	}

	public static void main(String[] args) {
		Factorial();
		

	}

}
