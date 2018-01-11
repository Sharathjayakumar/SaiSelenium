package com.study.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ISCheckPoint {
	static FirefoxDriver driver;
	public static void main(String[] args) throws Throwable {
		//isEnabled(); isDispalyed();  isSelected()
		driver = new FirefoxDriver();
		//isCheckForEnable();
		//isCheckForSelected();
		isCheckForDispaly();
	}

	public static void isCheckForDispaly() throws Throwable
	{
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		Thread.sleep(4000);
		

		try {
			if(driver.findElement(By.xpath("//h1[text()='Book Your Tickets Now']")).isDisplayed())
			{
				System.out.println("Text are Visible");
			}
		} catch (Exception e) {
			System.out.println("Not Visible");
		}
		
		System.out.println("Completed");
		
		
	}
	public static void isCheckForSelected() throws Throwable
	{
		


		driver.get("http://www.ksrtc.in/oprs-web/");
		Thread.sleep(25000);

		if(driver.findElement(By.id("singleLady")).isSelected())
		{
			System.out.println("Single Lady is Checked");
		}
		else
		{
			System.out.println("Single Lady is not Checked");
			driver.findElement(By.id("singleLady")).click();
			Thread.sleep(2000);
			if(driver.findElement(By.id("singleLady")).isSelected())
			{
				System.out.println("Second IF Checked");
			}
			else
			{
				System.out.println("Second If Not Checked");
			}
		}
	}
	
	public static void isCheckForEnable() throws Throwable
	{
		driver = new FirefoxDriver();

		//isEnabled(); isDispalyed();  isSelected()
		driver.get("https://www.carwale.com/comparecars/?ltsrc=v1786&gclid=EAIaIQobChMIrdiy88W61gIV0IZoCh1-JQiOEAAYASAAEgIBFPD_BwE");
		Thread.sleep(5000);

		/*int aa = 28;
		double b = (double) aa;*/
		JavascriptExecutor jsx = (JavascriptExecutor)driver;

		boolean ModelDrop = driver.findElementById("drpModel1").isEnabled();
		if(ModelDrop)//ModelDrop==true
		{
			System.out.println("Model Dropdown button is Enabled");
		}
		else
		{
			System.out.println("Model Dropdown button is Disabled at First Time: "+ModelDrop);
			if(driver.findElement(By.id("drpMake1")).isEnabled())
			{
				new Select(driver.findElement(By.id("drpMake1"))).selectByIndex(7);
				Thread.sleep(2000);
				jsx.executeScript("window.scrollTo(0,0)");

				new Select(driver.findElementById("drpModel1")).selectByVisibleText("Redi-GO");
				Thread.sleep(2000);
				jsx.executeScript("window.scrollTo(0,0)");
				new Select(driver.findElementById("drpModel1")).selectByValue("467");
				jsx.executeScript("window.scrollTo(0,0)");
				Thread.sleep(5000);
				driver.executeScript("window.scrollTo(0,1500)");
			}
			else
			{
				System.out.println("Make is Disabled");
			}
			System.out.println("Second Time: "+driver.findElement(By.id("drpModel1")).isEnabled());
		}

	}
}
