package com.study.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubtWorkNGear {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.workngear.com/");
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='cart-count' and text()='1']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader']")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[div[@id='top-links-cart-count']]/span[1]")));
		
		driver.findElement(By.xpath("//a[div[@id='top-links-cart-count']]/span[1]")).click();
		
	}

}
