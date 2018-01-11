package com.study.selenium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new FirefoxDriver();
		
		//Below Code is to demonstrate Implicit Wait
/*		
		driver.get("http://seleniumhq.org");
		WebElement ele = waitImply("id", "q", driver);
		ele.sendKeys("Driver"); //2 sec
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Projects1")).click(); //Starting 2 seconds (48) 
		driver.findElement(By.linkText("Hello")).click();//20 sec
*/
		
		
		ExpWait();
		
	}

	public static void ExpWait()
	{
		WebDriverWait webWait = new WebDriverWait(driver, 30);		
/*		
 		driver.get("http://www.ksrtc.in/oprs-web/");
 		webWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("PNR Enquiry")));
		//webWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("PNR Enquiry"))));

		driver.findElement(By.linkText("PNR Enquiry")).click();*/
		
		driver.get("https://www.hdfcbank.com/");
		
		webWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='slidingbanners']/div[1]/div[1]/iframe")));
		//webWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slidingbanners']/div[1]/div[1]/iframe")));
		
		WebElement slideFrame = driver.findElement(By.xpath("//div[@class='slidingbanners']/div[1]/div[1]/iframe"));
		driver.switchTo().frame(slideFrame);
		webWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='thumbnailcontainer']/div[@id='thumbnail-3'and @class='thumbnail active']")));
		//webWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='thumbnailcontainer']/div[@id='thumbnail-3'and @class='thumbnail active']")));
		driver.findElement(By.xpath("//div[@id='prd-item-list-3']//div[@id='banner-button']")).click();

		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Products")).click();
		
	}
	
	public static  WebElement waitImply(String LT, String LV, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id(LV));
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		return (element);
	}
}
