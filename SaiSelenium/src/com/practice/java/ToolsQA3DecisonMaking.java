package com.practice.java;

public class ToolsQA3DecisonMaking {

	public static void main(String[] args) {
		//There are two type of decision making statements namely, If then statement and Switch Statement.
		
		String sName = "Test";
		
		int iNum = 100;
		
		if (sName.equals("Test")) 
		{
			System.out.println("Test is Success");
		}
		
		else {
			
			System.out.println("Test is not success");
		}
		
		if(iNum==100)
		{
			System.out.println("Print iNum Value:"+ iNum);
		}
		
		else 
		{System.out.println("Cannot Print");
		}
//--------------------------------------------------------------------
		//If-ElseIf-Else
		
		String str = "Newtest";
		
		int iNew=200;
		
		if(str.equals("Test")) {
			
			System.out.println("Print Fail");
		}
		
		else if (str.equals("Newtest")) {
			System.out.println("Print Pass");
		}
		else {System.out.println("Null");
		}
		
		if (iNew==100) {
			System.out.println("Null");
		}
		else if(iNum==300) {
			System.out.println("Null2");
		}
		else {
			System.out.println("Print iNum:" +iNum);
		}
//-----------------------------------------------------------------
		//Switch Case Statement
		
		switch(str) {
		case "Hi":
		System.out.println("Test Fail1");
		break;
		case "Newtest":
		 System.out.println("Test Switch Pass");
		 break;
		}
//----------------------------------------------------------------
		
		switch(iNum) {
		
		case 1200:
			System.out.println("Print:"+iNum);
			break;
			
		case 1100:
			System.out.println("Pass:"+iNum);
			break;
		default:
			System.out.println("Switch default Success");
			break;
		}
	}

}
