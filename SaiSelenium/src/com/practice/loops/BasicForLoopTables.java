package com.practice.loops;

import java.util.Scanner;

public class BasicForLoopTables {

	public static void main(String[] args) {
		
	/*	for(int i=1;i<=5;i++) {
			System.out.println("Hello");
		}
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Table:");
		int a = input.nextInt();
		
		System.out.println("Enter the Count:");
		
		int b =input.nextInt();
		
		//System.out.println(a*b);
		
		for(int i=1;i<=b;i++) {
			
			System.out.println(i+"*"+a+"="+(i*a));
		}
		
		/*int i =1;
		while (i<=b) {
			System.out.println(i+"*"+a+"="+(i*a));
			i++;*/
		}
	}


