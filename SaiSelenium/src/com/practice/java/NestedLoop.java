package com.practice.java;

public class NestedLoop {

	public static void main(String[] args) {
	
		//Nested for loop
		
	/*	for(int i=0;i<=4;i++) {
			
			System.out.println("Iteration:" +i);
			
			for(int j=1;j<=2;j++)
			{
				System.out.println("i="+i+"j="+j);
			}
		}*/
		
	/*	int i =1;
		
		while(i<=4) {
			
			System.out.println("Iteration:"+i);
			
			for(int j=1;j<=2;j++) {
				
				System.out.println("i="+i+"j="+j);
			}
			i++;*/
//To print pattern
		
		int rows=5;
		for(int i=1;i<=rows;++i) {
			for(int j=1;j<=i;++j)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
			
		}
		
	}


