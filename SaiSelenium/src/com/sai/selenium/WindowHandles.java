package com.study.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver1, driver2;
		driver1 = new FirefoxDriver();
		WrapperFunction wrap = new WrapperFunction();
		wrap.loadURL(driver1, "http://www.tnstc.in/");
		wrap.javaWait(4000);
		String HomeScreen1 = driver1.getWindowHandle();
		System.out.println("This is driver1 1 Window Property: "+HomeScreen1);
	
		
		
		/*
		driver2 = new FirefoxDriver();
		wrap.loadURL(driver2,"http://www.tnstc.in/");
		String HomeScreen2 = driver2.getWindowHandle();
		System.out.println("This is driver1 2 Window Property: "+HomeScreen2);
		*/
		
		String HomeScreenTitle = driver1.getTitle();
		System.out.println(HomeScreenTitle);
		wrap.clickElements(driver1, "linktext", "Information");
		wrap.clickElements(driver1, "css", "img[src='images/eTicket_button.jpg']");
		wrap.switchWindowByTitle(driver1,"TNSTC.");

		wrap.enterTextonField(driver1,"name","txtUserLoginID","Testing");	
		wrap.clickElements(driver1, "css", "img[alt='Radiant Infosystems']");
		wrap.switchWindowByURL(driver1, "http://www.radiantinfo.com/");
		wrap.clickElements(driver1, "xpath", "//*[contains(@*,'products')]");
		wrap.switchWindowByTitle(driver1, ":: SETC ::");
		wrap.clickElements(driver1, "xpath", "//img[@src='images/login_button.jpg']");
		
		//Current will close
		driver1.close();
		
		driver1.quit();
		
		
	}
}
