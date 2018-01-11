package com.sai.inherit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseInheri {

	static WebDriver driver;
	public static void main(String[] args) {
		findElements test = new findElements();
		
		//hitURL test = new hitURL();
		test.setupBrowser();
		test.hit();
		test.elementFind();
	}
	
	public void setupBrowser()
	{
		
		driver = new FirefoxDriver();
	
		
		
	}

}
