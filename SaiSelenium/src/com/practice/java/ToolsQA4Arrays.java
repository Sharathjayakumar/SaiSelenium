package com.practice.java;

public class ToolsQA4Arrays {
	
	public static boolean[] ReturnArray() 
	{
		boolean[] aBoolean= {true,false,true};
		
		return aBoolean;
	}
	
	public static void PrintArrayValue(String[]array)
	{
		for (int b=0;b<=array.length-1;b++) {
			System.out.println("The array value is:" +array[b]);
		}
	}
	
//----------------------------------------------------------Main Method----------------------
	public static void main(String[] args) {
		//Array ===> It is a data structure in java that can hold one or more values in a single variable.Index starts fro 0
		//Arraytype[] ArrayName = new ArrayType[size of an array]; or ArrayType[] ArrayName ={Values};
	
	//Directly accessing values in array
		int[] aNum= {1,2,3,4,5};
		int aLength=aNum.length;

		System.out.println(aLength);
		System.out.println(aNum[0]);
		int aNum1=aNum[1];
		System.out.println(aNum1);
		
		for(int i=0;i<=4;i++) //if we know the array length we can directly mention i<=4 otherwise we need to use length propery to find it
		{
			System.out.println("The array value of index "+i+" is:"+aNum[i]);
		}
//------------------------------------------------------------------------------------------------------			
		
//Passing Array to a method 
		
		String[] aName= {"Sarath","Arun","Gokul","Karthick","Roshan","Praveen"};
		
		int sLength = aName.length;
		System.out.println("The length of an string array is:"+sLength);
		PrintArrayValue(aName);
		
//---------------------------------------------------------
		
		boolean[] aBoolean = ReturnArray();
		int h =aBoolean.length;
		System.out.println("The Boolean array length is:"+h);
		
		for (int c=0;c<=h-1;c++) 
		{
			System.out.println("The Boolean array value of is:"+aBoolean[c]);
			}
}
}
