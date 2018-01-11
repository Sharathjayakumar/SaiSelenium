package com.sai.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDefault {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tnstc.in/TNSTCOnline/preUserRegistration.do");;
		Thread.sleep(5000);
		System.out.println("Default Selected Option: ");
		System.out.println(new Select(driver.findElement(By.name("selectGender"))).getFirstSelectedOption().getText());
		System.out.println("Country: "+new Select(driver.findElement(By.name("selectCountry"))).getFirstSelectedOption().getText());
		
		int TotalCountryCount = new Select(driver.findElement(By.name("selectCountry"))).getOptions().size();
		System.out.println("Your Total Country is: "+TotalCountryCount);
		String BaseXpath = "//select[@name='selectCountry']/option";
		String ExpCountry = "Philippines";
		
		
		/*for(int i=1;i<=TotalCountryCount;i++)
		{
			new Select(driver.findElement(By.name("selectCountry"))).selectByIndex(i-1);
			String updatedXpath = BaseXpath+"["+i+"]";
			System.out.println(updatedXpath+"=======>"+driver.findElement(By.xpath(updatedXpath)).getText());
		}*/
		
		int xxx=0;
		boolean flag=false;
		CountrySelection: for(int i=0;i<TotalCountryCount;i++)
		{
			String updatedXpath = BaseXpath+"["+(i+1)+"]";
			String ActCountry = driver.findElement(By.xpath(updatedXpath)).getText();
			System.out.println(ActCountry);
			if(ExpCountry.equals(ActCountry))
			{
				xxx=10;
				System.out.println("Value are available in the DropDown");
				flag = true;
				new Select(driver.findElement(By.name("selectCountry"))).selectByVisibleText(ExpCountry);
				break CountrySelection;
			}	
		}
		
		if(!flag) //if(flag==false)
		{
			System.out.println("Values are not avail in the Dropdown");

		}
		System.out.println("completed");
		
		
	}

}
