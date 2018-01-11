package com.study.oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OOPS_HOME 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("This is HOME Class");
		OOPS_Kitchen key1 = new OOPS_Kitchen();// Object Creation For Kitchen Class
		key1.GAS();//Calling Method ---------------------------
		OOPS_BedRoom key11 = new OOPS_BedRoom();
		key11.AC();
		WebDriver driver = new FirefoxDriver();
		WebElement element= driver.findElement(By.id(""));

		System.out.println("This is Last STEP");
	}
}