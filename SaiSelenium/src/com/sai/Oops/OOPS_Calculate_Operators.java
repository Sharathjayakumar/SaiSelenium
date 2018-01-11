package com.sai.Oops;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class OOPS_Calculate_Operators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//boolean flag = false;
		String ch;

		System.out.println("Enter the Value 1: ");
		int val1 = input.nextInt();
		System.out.println("Enter the Value 2: ");
		int val2 = input.nextInt();
		do
		{
			System.out.println("Please Choose the Below Operations:");
			System.out.println("\n1 ---> ADD\n2 ---> SUB\n3 ---> MUL\n4 ---> DIV");
			int choice = input.nextInt();
			switch (choice)
			{
			case 1: 
			{
				OOPS_ADD ad_obj = new OOPS_ADD();
				
				int add_result = ad_obj.ADD_Value(val1, val2);
				System.out.println("Your Add Value is: "+add_result);
				//add_result=add_result+50;
				//flag = true;
				break;
			}

			case 2:
			{
				OOPS_SUB sb_obj = new OOPS_SUB();
				sb_obj.SUB_Val(val1,val2);
				//flag = true;
				break;
			}

			case 3:
			{
				OOPS_MUL ml_obj = new OOPS_MUL();
				ml_obj.MUL_value();
				//flag = true;
				break;

			}

			case 4:
			{
				OOPS_DIV dv_obj = new OOPS_DIV();
				double div_result = dv_obj.Div_val(val1,val2);
				System.out.println("Your Div Value is: "+div_result);
				//flag = true;
				break;
			}
			
			default:
			{
				System.out.println("Please Choose Correct Options");
				//flag=true;
				break;
			}
			}
			System.out.println("IF yes press 'Y' else press 'N'");
			ch = input.next();
		}
		while(ch.equalsIgnoreCase("y"));
	}
}