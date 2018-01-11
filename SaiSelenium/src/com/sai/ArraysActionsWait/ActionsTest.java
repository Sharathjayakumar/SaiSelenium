package com.study.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActionsTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
		
		WebDriverWait webWait = new WebDriverWait(driver,30);
		
		webWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nav-link-shopall"))));
		
		Actions cursor = new Actions(driver);
		
		WebElement Shop = driver.findElement(By.id("nav-link-shopall"));
		cursor.moveToElement(Shop).build().perform();
		
		webWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='TV, Appliances, Electronics']")));
		WebElement TV = driver.findElement(By.xpath("//span[text()='TV, Appliances, Electronics']"));
		cursor.moveToElement(TV).perform();
		
		webWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Speakers']")));
		WebElement Speakers = driver.findElement(By.xpath("//span[text()='Speakers']"));
		//cursor.click(Speakers).perform();
		
		//cursor.doubleClick(Speakers).perform();
		
		cursor.contextClick(Speakers).perform();
		
		Robot robot = new Robot();
		
		for(int i=1;i<=3;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(4000);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
