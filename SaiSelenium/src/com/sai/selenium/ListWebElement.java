package com.sai.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListWebElement {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tnstc.in/TNSTCOnline/preUserRegistration.do");
		Thread.sleep(4000);
		
		WebElement country = driver.findElement(By.name("selectCountry"));
		List <WebElement> countryCount = country.findElements(By.tagName("option"));
		
		
		for(WebElement element:countryCount)
		{
			System.out.println(element.getText());
		}
		
	/*	for(int i=5;i<countryCount.size()-2;i++)
		{
			WebElement countryElement = countryCount.get(i);
			System.out.print(countryElement.getText());
			System.out.println("\t"+countryElement);
			if(countryElement.getText().equals("India"))
			{
				break;
			}
		}
		*/
		
		/*System.out.println("Without List Concept");
		String BaseXpath = "//select[@name='selectCountry']/option[";
		for(int i=1;i<=30;i++)
		{
			String updatedXpath = BaseXpath+i+"]";
			WebElement elementNew = driver.findElement(By.xpath(updatedXpath));
			System.out.println(elementNew.getText());
			
		}*/
		
	}

}
