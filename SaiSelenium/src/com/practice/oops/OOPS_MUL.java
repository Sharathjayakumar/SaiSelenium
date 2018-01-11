package com.practice.oops;

import java.util.Scanner;

public class OOPS_MUL {

	public void MUL_value()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Mul Val 1: ");
		int mul1 = input.nextInt();
		System.out.println("Enter Mul Val 2: ");
		int mul2 = input.nextInt();
		int res = mul1*mul2;
		System.out.println("The mul value is:"+res);
	}
}
