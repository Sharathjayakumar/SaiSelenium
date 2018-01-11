package com.sai.constnmethodoverload;

public class BaseOverloading {

	public static void main(String[] args) {
	
		MethodOverload obj = new MethodOverload();
		obj.add('r','e');
		obj.add(34, 56,567);
		obj.add(3.5, 3);
		obj.add(1, 2, 3);
	
		int a=10;
		a=a+5;
		
		int c= a+10;
		System.out.println(c);
		
		
		System.out.println("15");
		
	}

}
