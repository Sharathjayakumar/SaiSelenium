package com.study.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetControlFromClosedWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1;
		driver1 = new FirefoxDriver();
		
		driver1.get("http://ksrtc.in/oprs-web/");
		Thread.sleep(4000);
		
		WrapperFunction wrap = new WrapperFunction();
		
		String ParentWindow = driver1.getWindowHandle();
		System.out.println("Main Method: "+ParentWindow);
		driver1.findElement(By.linkText("Kannada")).click();
		
		
		
		//wrap.switchWindowByTitle(driver1, "Karnataka State Road Transport Corporation");
		
		wrap.clickElements(driver1, "xpath", "//*[@*='Cancle Ticket']");
		driver1.close();
		
		wrap.switchWindowByHandles(driver1, ParentWindow);
		driver1.findElement(By.id("fromPlaceName")).sendKeys("Trichy");
	}

}
