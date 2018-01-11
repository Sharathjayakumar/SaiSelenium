package com.cg.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkDoubt {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.tnstc.in/eBooking/e-terms.html");
		Thread.sleep(4000);
		
		List <WebElement> closeCount = driver.findElements(By.xpath("//a[@class='closeBtn']"));
		
		WebElement bottomClose = closeCount.get(0);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.backgroundColor = 'yellow'", bottomClose);
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", bottomClose);
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();",bottomClose);
		bottomClose.click();
		
		//driver.findElement(By.linkText("HealthCare")).click();
		
	}
}
