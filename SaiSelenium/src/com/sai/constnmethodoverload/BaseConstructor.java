package com.sai.constnmethodoverload;

public class BaseConstructor {

	BaseConstructor()
	{
		System.out.println("BaseConstructor");
	}
	
	public static void main(String[] args) {
	
		System.out.println("This is inside main");
		//new BaseConstructor();
		
		new DemoConstrctor();
		new DemoConstrctor(45);
		new DemoConstrctor("Saarath");
		
		DemoConstrctor obj=new DemoConstrctor(); 
		obj.printValues();
		System.out.println("Completed");
		
	}

}
