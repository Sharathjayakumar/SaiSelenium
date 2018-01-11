package com.practice.java;

public class Durgasoft {

	int a = 50;
	int b = 100;

	static int c = 150;
	static int d = 200;

	public void method1() {

		System.out.println(a);
		System.out.println(b);
		System.out.println(Durgasoft.c);
		System.out.println(Durgasoft.d);
		System.out.println("Hi");
	}

	public static void method2() {

		Durgasoft du = new Durgasoft();

		System.out.println(du.a);
		System.out.println(du.b);
		System.out.println(du.c);
		System.out.println(d);

	}
	public static void main(String[] args) throws Throwable {

		Durgasoft.method2();
		Durgasoft du = new Durgasoft();

		du.method1();
		
		String str = "Sarath";
		
		String str1 = str.substring(1,5);
		
		System.out.println(str1);
		
StringBuffer sb = new StringBuffer("Sarah");

System.out.println(sb.toString());
System.out.println(Math.sqrt(100));





	}

}
