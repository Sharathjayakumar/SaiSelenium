package com.practice.java;

public class ToolsQA5LOOPS {

	public static void main(String[] args) {
		// FOR Loop, While loop, do-while loop, Enhanced For loop
		
		for(int Increment=0;Increment<=5;Increment++) {
			System.out.println("Print Success:"+Increment);
		}

		for (int Decrement=5;Decrement>=0;Decrement--) {
			System.out.println("Print Decrement:"+Decrement);
		}
		
		for(int i=0;i<=5;i+=2) {
			
			System.out.println(i);
		}
		
		for (int d=5;d>=0;d-=2) {
			System.out.println(d);
		}
		
//-------------------------------------------
		
		for(int i=0;i<=10;i++) {
			if(i==7) 
			{
			break;
			}
			System.out.println(i);
		}
	
		for(int count =0;count<=6;count++) {
			
			if(count==5) {
				//to print only 5
				//System.out.println("Count is:" +count);
				continue;
			}
			//To print 0 1 2 3 4 6
			System.out.println("Count is:" +count);	
		}
		
//-----------------------------------------------------------------
		int xWhile=0;
		
		while(xWhile<25) {
			
			xWhile+=5;
			System.out.println("While loop is:"+xWhile);	
		}
//DoWhile Loop
		
		int doLoop=0;
		
		do {
			doLoop+=5;
			System.out.println(doLoop);
		}
		while(doLoop<=25);
		
//Enhanced for Loop ===> for(data_type Variable:arrayname)
		String[] days= {"Mon","Tue","Wed","Thur","Friday","Sat","Sun"};
		//Enhanced for loop as below
		for(String dayz:days) {
			System.out.println(dayz);
		}
		
		//Normal for loop to print days in string
		for(int i=0;i<=days.length-1;i++) {
			System.out.println(days[i]);
		}
	}
}


