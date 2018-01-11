package com.practice.loops;

public class NestedForIJValues {

	public static void main(String[] args) {
		
	/*	System.out.println("i\tj");
		System.out.println("--------------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				
		System.out.println(i +"\t"+j);
			}
		}
		*/
//--------------------------------------------------------------
/*		1
		22
		333
		4444*/
		
		/*for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(i);
			}
			System.out.println();
		}*/
//-------------------------------------------------
	/*	5
		54
		543
		5432
		54321*/
		
/*		for(int i=5;i>=1;i--) {
			
			for(int j=5;j>=i;j--) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		*/
//-------------------------------------
	/*	1
		12
		123
		1234*/
		
	/*	for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}*/
		
//---------------------------------------
/*
		1
		23
		456
		78910*/
		
	/*	int sum =0;
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				sum=sum+1;
				System.out.print(sum+"");
			}
			System.out.println();
		}
		*/
//--------------------------------------------------------
		
/*		1111
		222
		33  
		4*/
		
/*		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>=i;j--) {
				
				System.out.print(i);
			}
			System.out.println();
		}*/
//------------------------------------------------------------
/*		54321
		5432
		543
		54
		5*/
		
/*		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				
				System.out.print(j);
			}
			System.out.println();
		}*/
		
//-------------------------------------
/*		4444
		333
		22
		1
		*/
/*		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++) {
				
				System.out.print(i);
			}
			System.out.println();
		}*/
		
//--------------------------------------------
/*		54321
		4321
		321
		21
		1*/
		
/*		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
//------------------------------------------
/*		1
		12
		123
		1234
		12345
		123456
		1234567
		12345678
		123456789*/
/*		
		for(int i=1;i<=9;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}*/
		
//-----------------------------------
		for (int i = 0; i < 5; i++) 
		{ 
			for (int j = 0; j < 5 - i; j++) 
			{ 
				System.out.print(" "); 
			} 
			for (int k = 0; k <= i; k++)
			{ 
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
