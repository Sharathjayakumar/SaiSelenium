package com.sai.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathStudy {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new FirefoxDriver();
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/");
		Thread.sleep(5000);
		
		WebElement FromStation = driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody[1]/tr[1]/td[1]/input[1]"));
		FromStation.clear();
		FromStation.sendKeys("TPJ");
		Thread.sleep(2000);
		FromStation.sendKeys(Keys.TAB);
		
		
		WebElement ToStation = driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody[1]/tr[1]/td[3]/input[1]"));
		ToStation.clear();
		ToStation.sendKeys("MAS");
		Thread.sleep(2000);
		ToStation.sendKeys(Keys.TAB);
		Thread.sleep(6000);
		
		WebElement ExpressName = driver.findElement(By.xpath("//table[@class='DataTable TrainList']/tbody[1]/tr[2]/td[2]/a[1]"));
		String TrainName = ExpressName.getText();
		System.out.println("This the train Which I need to Click: "+TrainName);
		ExpressName.click();
		
		
		
		
	}
}
