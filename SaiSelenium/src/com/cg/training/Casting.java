package com.cg.training;

public class Casting {

	public static void main(String[] args) {
	
		//It Converts from one Data type to Another Data Type
		
		
		//Below code is used to Convert int to double 
	/*	int a=20;
		double b=a; // Inbuilt Casting
		System.out.println(b);*/
		
		/*double x=13.37;
		int xx= (int)x; //User Defined Casting
		System.out.println(xx);*/
		
		//Below Code is used to convert Char to int
		
	/*	char ccc='d';
		System.out.println(ccc);
		
		int b=ccc;
		
		System.out.println(b);*/
		
		//Below Code is used to convert int to Char
		
/*		int a =100;
		
		System.out.println(a);
		
		char b= (char)a;
		
		System.out.println(b);*/
		
		

		
	System.out.println("ASCII\tOriginal Value");
		
		//Below code is another example for inbuilt casting 
	
		for(char ch=40;ch<=115;ch++)
		{
			int ascc = ch;
			System.out.println(ascc+"\t"+ch);
		}
		
/*		for(int dd='#';dd<='s';dd++)
		{
			System.out.println(dd+"\t"+(char)dd);
		}*/
		
		
		
		//Below code is used to understand int to String
		
/*		int z=10;
		String age=""+z;
		
		System.out.println("Int Value: "+(z+10));
		System.out.println("String Value: "+(age+10));*/
	
		
		//Below code is used to understand String to int, Double
	
/*		String Avg = "35.1234456";
		
		//int aag = Integer.parseInt(Avg);
		double ag=Double.parseDouble(Avg);
		
		System.out.println(ag);*/
		
		
/*		int c=12;
		
		String str = Integer.valueOf(c).toString();
		System.out.println(str+12);*/
		
		
		
/*		
		byte by =127;
		
		System.out.println(by);
		
		for(int i=1;i<=by;i++) {
			
			System.out.println(i);
			*/
	
/*		for(short i=1;i>0;i++) {
			
			System.out.println(i);
		}*/
		
/*		for(int i =1; i>0;i++) {
			System.out.println(i);
		}*/
		
		}
}

