package com.cg.training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPaytm {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		WebElement element = driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
		driver.switchTo().frame(element);	
		System.out.println("Hello");
		driver.findElement(By.xpath("//md-input-container[span[@class='number-prefix-new ng-hide']]")).click();
		driver.findElement(By.xpath("//md-input-container[span[@class='number-prefix-new ng-hide']]/input[1]")).sendKeys("Sharathjayakumar@gmail.com");
		//driver.findElement(By.xpath("//md-input-container[span[@class='number-prefix-new ng-hide']]/input[1]")).sendKeys(Keys.TAB);
       
		driver.findElement(By.xpath("//md-input-container[@ng-if='!showPass']")).click();
		driver.findElement(By.xpath("//md-input-container[@ng-if='!showPass']/input[1]")).sendKeys("password123");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='_1MBe transparent']/div[1]/a[1]")).click();
		
		System.out.println("Program Completed");
		
		

	}

}
