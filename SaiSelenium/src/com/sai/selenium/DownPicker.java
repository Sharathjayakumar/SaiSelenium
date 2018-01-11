package com.sai.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DownPicker {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.tnstc.in/TNSTCOnline/preUserRegistration.do");
		Thread.sleep(5000);
		
		new Select(driver.findElement(By.name("txtSecretQuestion"))).selectByVisibleText("First child's middle name?");
		Thread.sleep(3000);	
		
		Select SecQues = new Select(driver.findElement(By.name("txtSecretQuestion")));
		
		SecQues.selectByValue("schoolname");
		Thread.sleep(3000);
		
		SecQues.selectByIndex(0);
		
		Thread.sleep(3000);
		int OptionCount = SecQues.getOptions().size();
		
		System.out.println("Your Total Options are : "+OptionCount);
		SecQues.selectByIndex(OptionCount-1);
		
		

		/*driver.get("https://www.carwale.com/comparecars/?ltsrc=v1786&gclid=EAIaIQobChMIrdiy88W61gIV0IZoCh1-JQiOEAAYASAAEgIBFPD_BwE");
		Thread.sleep(5000);*/
		
		
	}

}
