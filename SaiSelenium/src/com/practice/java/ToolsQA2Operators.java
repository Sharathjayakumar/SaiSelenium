package com.practice.java;

import com.gargoylesoftware.htmlunit.javascript.host.Symbol;

public class ToolsQA2Operators {
	
	static int a = 100;
	
	static String sName="Sarath";
	
	static boolean bGood = true;
	
	public static void main(String[] args) {
		
		//Operators are special characters within java language to manipulate primitive data type
		
		//Assignment Operator
		//"="
		// Syntax: Variable '=' expression
		
		System.out.println("The int value is:"+a);
		
		System.out.println("The string name is:"+sName);
		
		System.out.println("The Boolean value is:"+bGood);
		
		a=200;
		sName="test";
		bGood=false;
		
		System.out.println(a);
		System.out.println(sName);
		System.out.println(bGood);
//---------------------------------------------------------------------------------
//Arithmetic Operators = Addition '+' Subtraction -'-' Multiplication '*' Division '/' Modulo '%' Increment '++' Decrement '--'
		
		int aAdd, bAdd = 10, cAdd = 5;
		
		aAdd = bAdd +cAdd;
		System.out.println("aAdd value after sum is:"+aAdd);
		aAdd = bAdd-cAdd;
		System.out.println("aAdd value after minus is:"+aAdd);
		aAdd = bAdd*cAdd;
		System.out.println("aAdd value after * is:"+aAdd);
		aAdd = bAdd/cAdd;
		System.out.println("aAdd value after / is:"+aAdd);
		aAdd = cAdd%bAdd;
		System.out.println("aAdd value after % is:"+aAdd);
		bAdd++;
		System.out.println("bAdd value after ++:"+bAdd);
		cAdd--;
		System.out.println("cAdd value after --:"+cAdd);
//------------------------------------------------------------------------
		//Relational Operators ===> Greater than '>' Less than '<' Greater than or Equal to '>=' Less than or equal to '<='
		//Equal '==' Not Equal '!='
		
		int ten=10, twenty=20, thirty=30;
		
		System.out.println("Is 10 greater than 20:"+(ten>twenty));
		System.out.println("Is 10 Less than 20:"+(ten<twenty));
		boolean Check = ten>=twenty;
		System.out.println("Is 10 greater than or equalto 20:"+Check);
		System.out.println("Is 10 Less than or equalto 20:"+(ten<=twenty));
		System.out.println("Is 10 equal to 20:"+(ten==twenty));
		System.out.println("Is 10 not equal to 20:"+(ten!=twenty));
//-------------------------------------------------------------------------------
		//Logical Operators ==> AND Operator '&&' OR Operator '||' NOT Operator '!'
		
        boolean LO=true, Log=false;

		boolean check2=(LO&&Log);
		
		System.out.println("Boolean of LO&&Log is:"+check2);
		
		System.out.println("Boolean of LO||LOg is:"+(LO||Log));
		
		System.out.println("Boolean of LO!Log is:"+(!Log));
//-----------------------------------------------------------------------
		//Conditional Operator ===> It Takes three operands (Ternary Operator). It is similar to If Else statement
		//Variable = (expression)?value if true: valu if false
		
		int cTen = 10;
		int cTwenty =20;
		int cThirty =30;
		boolean bcValue;
		int cValue;
		
		bcValue = (cThirty==cTen+cTwenty)? true:false;
		
		System.out.println("The Boolean value after conditon is:"+bcValue);
		cValue=(cThirty==cTen+cTwenty)?30:50;
		System.out.println("the cThirty value is:"+cValue);
		cValue=(!(cThirty==cTen+cTwenty))?30:50;
		System.out.println(cValue);

	}

}
