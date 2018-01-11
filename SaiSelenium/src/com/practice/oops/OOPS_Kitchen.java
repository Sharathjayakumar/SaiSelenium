package com.study.oops;

import org.openqa.selenium.By;

public class OOPS_Kitchen 
{
	public void GAS() //Called Function
	{
		System.out.println("This is GAS");
		OOPS_BathRoom Key5 = new OOPS_BathRoom();
		Key5.Heater();
		Key5.WATER();//----------------------------
	}
	
	/*public void findElement()
	{
		
	}*/
	
	public void sendKeys(String Input)
	{
		System.out.println(Input);
	}
}
