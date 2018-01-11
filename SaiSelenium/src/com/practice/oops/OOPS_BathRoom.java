package com.study.oops;

public class OOPS_BathRoom {
	
	public void WATER()
	{
		System.out.println("This is Water");
		OOPS_Hall Key3 = new OOPS_Hall();
		Key3.TV();//-----------------------------
	}
	
	public void Heater()
	{
		System.out.println("This is Heater");
		WATER();//----------------------------------
	}
}
