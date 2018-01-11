package com.study.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class WrapperFunction {

	public void loadURL(WebDriver driver, String URL)
	{
		driver.manage().window().maximize();
		driver.navigate().to(URL);

	}

	public void javaWait(int millisec) throws InterruptedException
	{
		Thread.sleep(millisec);
	}

	public WebElement returnOfElement(WebDriver driver, String LocatorType, String LocatorValue)
	{
		WebElement element = null;
		if(LocatorType.equalsIgnoreCase("id"))
		{
			element = driver.findElement(By.id(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("name"))
		{
			element = driver.findElement(By.name(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("class"))
		{
			element = driver.findElement(By.className(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("linktext"))
		{
			element = driver.findElement(By.linkText(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("plink"))
		{
			element = driver.findElement(By.partialLinkText(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("Css"))
		{
			element = driver.findElement(By.cssSelector(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("tagname"))
		{
			element = driver.findElement(By.tagName(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("xpath"))
		{
			element = driver.findElement(By.xpath(LocatorValue));
		}
		else
		{
			System.out.println("Your Locator Type Doesn't Match");
		}
		return element;
	}
	public void clickElements(WebDriver driver, String LocatorType, String LocatorValue)
	{
		WebElement clickableElement = returnOfElement(driver, LocatorType, LocatorValue);
		clickableElement.click();
	}

	public void enterTextonField(WebDriver driver, String LocatorType, String LocatorValue, String ActualVal)
	{
		WebElement TextElement = returnOfElement(driver, LocatorType, LocatorValue);
		TextElement.sendKeys(ActualVal);
	}

	public void switchWindowByTitle(WebDriver driver, String changeTitle) throws InterruptedException
	{
		Set <String> totalWindows = driver.getWindowHandles();
		int totalWindowCount = totalWindows.size();

		if(totalWindowCount>1)
		{
			for(String loopwindow:totalWindows)
			{
				driver.switchTo().window(loopwindow);
				Thread.sleep(3000);
				String currentTitle = driver.getTitle();
				if(currentTitle.equals(changeTitle))
				{
					break;
				}

			}
		}
		else
		{
			System.out.println("No new Window was Found");
		}		
	}

	public void switchWindowByURL(WebDriver driver, String changeURL) throws Throwable
	{
		Set <String> totalWindows = driver.getWindowHandles();
		int totalWindowCount = totalWindows.size();
		if(totalWindowCount>1)
		{
			for(String loopwindow:totalWindows)
			{
				driver.switchTo().window(loopwindow);
				Thread.sleep(3000);
				String currentURL = driver.getCurrentUrl();
				if(currentURL.equals(changeURL))
				{
					break;
				}

			}
		}
		else
		{
			System.out.println("No new Window was Found");
		}		
	}

	public void switchWindowToNewWind(WebDriver driver, String Handle) throws InterruptedException
	{
		Set <String> totalWindows = driver.getWindowHandles();
		for(String loopwindow:totalWindows)
		{
			driver.switchTo().window(loopwindow);
		}
	}
	
	public void switchWindowByHandles(WebDriver driver, String Handle) throws InterruptedException
	{
		Set <String> totalWindows = driver.getWindowHandles();
		int totalWindowCount = totalWindows.size();
		for(String loopwindow:totalWindows)
		{
			driver.switchTo().window(loopwindow);
			Thread.sleep(3000);
			String currentHandle = driver.getWindowHandle();
			if(currentHandle.equals(Handle))
			{
				System.out.println(currentHandle);
				break;
			}
		}

	}
}
