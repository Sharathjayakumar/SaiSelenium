package com.doubt.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubtSarath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkataramani\\Desktop\\Selenium Software\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");

		driver.manage().window().maximize();

		String aXpath = "//div[@class='col-md-4']/button";

		for (int i=1;i<=8;i++) {

			String bXpath = aXpath +"["+i+"]";

			WebElement ele = driver.findElement(By.xpath(bXpath));

			String text = ele.getText();

			System.out.println("Text Value is:"+text);

			if(text.contains("Autocloseable")){

				//ele.click();
				clickElement(ele,driver);
				Thread.sleep(7000);

				System.out.println("Alert is Closed automatically ");

			}
			else if(text.contains("Normal")) {

				ele.click();
				//clickElement(ele,driver);
				Thread.sleep(4000);
				
				List <WebElement> closeAllElement= driver.findElements(By.xpath("//button[@class='close']"));
				//clickElement(ele2,driver);
				for(WebElement element:closeAllElement)
				{
						
					try {
						JavascriptExecutor jsx = (JavascriptExecutor)driver;
						jsx.executeScript("arguments[0].style.backgroundColor = 'Yellow'", element);
						jsx.executeScript("arguments[0].style.border='3px Solid Red'", element);
						element.click();
					} catch 
					(Exception e) {
						// TODO Auto-generated catch block
					
					}
				}
				
				


				System.out.println("Alert is Closed Manually");


			}

		}
	}
	public static void clickElement(WebElement element, WebDriver driver) {
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("arguments[0].click()", element);
	}

}
