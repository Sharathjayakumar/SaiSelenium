package com.sai.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandle{

	public static void main(String[] args) throws Throwable {

		/*	
	    try 
		{
			System.out.println(10/0);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		 */

		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.tnstc.in/TNSTCOnline/");

		Thread.sleep(5000);
		String UsernameXpath = "//input[@name='txtUserLoginID'][@maxlength='25']";
		//driver.findElement(By.xpath(UsernameXpath)).sendKeys("Harish");
		driver.findElement(By.name("txtPassword")).sendKeys("asdasd");

		createFinalAlert(driver);
		driver.findElement(By.linkText("Sign In")).click();
		//Below code is used to understand By default Accept or Dismiss
		//HandleAlert(driver);

		verifyAlertTextAndDecide(driver);

		driver.findElement(By.xpath(UsernameXpath)).sendKeys("Sarath");
		System.out.println("Main Method Completed");
	}

	public static void createFinalAlert(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("alert('Please Make Ensure You have Filled All the Mandatory Field before Clicking on Sign in Button');");
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
	}

	public static void verifyAlertTextAndDecide(WebDriver driver)
	{
		try 
		{
			Alert alert = driver.switchTo().alert();
			String AlertText = alert.getText();

			System.out.println("This the Text which is avail in Alert: "+AlertText);
			if(AlertText.equals("Password is Required"))
			{
				alert.dismiss();
				System.out.println("Alert is dismissed");
			}
			else if(AlertText.equals("User Name is Required"))
			{
				alert.accept();
				System.out.println("Alert is Accepted");
			}


		} catch (Exception e) {

			System.out.println("Alert is Not Present");
		}




	}

	public static void HandleAlert(WebDriver driver) throws Throwable
	{
		try 
		{
			Thread.sleep(5000);			
			//Below Method is one way to Handle an Alert 
			/*			Alert alert = driver.switchTo().alert();
			System.out.println("Alert Came");
			//alert.accept(); //For Pressing OK Button
			alert.dismiss(); //For Pressing Cancel Button
			 */			
			//Below code is second way to Handle an Alert

			/*driver.switchTo().alert().accept();
			driver.switchTo().alert().dismiss()*/;

		}
		catch (Exception e) {
			System.out.println("Alert Not Came");
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
