package com.practice.java;

public class ToolsQA1DataTypeandVariables {

	public static void main(String[] args) {
		
		//DataTypes available are byte, short, int, long, char, string, boolean, float
	//DataTypeNameofVariable VariableName = Value;
		//Below code is for Declaration of Variables
		byte b;
		short s;
		int i;
		char c;
		String Str;
		boolean boo;
		float f;
		double d;
		
		
		//Below code is for Initializatio of Variables = assigning values
		
		b=1;
		s=1234;
		i=4444;
		c='d';
		Str="Sarath";
		boo=true;
		f=44444;
		d=1.222222;
		
		//Below code is for printing teh output in console
		
		System.out.println("The byte number is: "+b);
		System.out.println("The short number is: "+s);
		System.out.println("The integer is: "+i);
		System.out.println("The Char value is: "+c);
		System.out.println("The String Value is:"+Str);
		System.out.println("The boolean value is: "+boo);
		System.out.println("The float value is: "+f);
		System.out.println("The double value is:"+d);
		
		//Direct Initialization of variables
		
		byte bBy=2;
		bBy=3;
		System.out.println("Byte value is: "+bBy);
		
		//Multiple initialization
		
		int p=1,q=2,r=3,t=4;
		System.out.println("P\tq\tr\tt");
		
		System.out.println(p+"\t"+q+"\t"+r+"\t"+t);
		
		//Exercise 1:Write a Java program to print “Hello World” on the screen.
		
		System.out.println("Hello world");
		
		//Exercise 2:Write a Java program to print the following output:
        //++++++
       //@@@@@@
       //******
      //######
		
		System.out.println("++++++");
		System.out.println("@@@@@@");
		System.out.println("******");
		System.out.println("#####");
		
		
		//Exercise 3: Write a Java program to declare three variable  l, m, & n and store the values respectively 10, 20.3 & 3.14785 . Then display their values on the screen.
		
		int l=10;
		double m = 20.3;
		double n = 3.14785;
		
		System.out.println("The integer value of l in exercise 3 is: "+l);
		System.out.println("The double value of m in exercise 3 is: "+m);
		System.out.println("The double value of n in exercise 3 is: "+n);
		
		//Exercise 4: Write a Java program to declare a Boolean variable with initial value of “true” and later change it to “false” before printing it.
		
		boolean booval=true;
		
		booval=false;
		
		System.out.println("The Boolean value of booval in exercise 4 is: "+booval);

	}

}
