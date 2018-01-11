package com.practice.loops;
import com.practice.java.*;
public class TestMain {
	
  int eID;
	
	String eName;
	
	float salary;
	
	void display() {
		
		System.out.println("eID:"+eID);
		
		System.out.println("eName:"+eName);
		
		System.out.println("Salary:"+salary);
	}

	Test1 m1() {

		Test1 t = new Test1();

		return t;
	}
	
	TestMain(){
		
		System.out.println("0-args constrctor");
		
	     eID = 1;
		
		eName ="Sarath";
		
		salary = 1000.05f;
	}
	
   /* TestMain(int a){
		
		System.out.println("1-args constrctor");
    }*/
	public static void main(String[] args) {

		TestMain t = new TestMain();
		 
		/*Test1 t1 = t.m1();
	
		
		System.out.println(t1);*/
		
		//TestMain t2 = new TestMain(10);
		//System.out.println(t2.m1());
		
		t.display();


	}

}
