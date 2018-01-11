package com.cg.training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayTMArun {

static WebDriver driver;

		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://paytm.com/");
			driver.manage().window().maximize();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
			System.out.println("Element clicked and frame launched");
			WebElement login=driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));//finding the frame and storing it in webelement
			driver.switchTo().frame(login);//switching control to frame
			WebElement ele = driver.findElement(By.xpath("//input[@id='input_0']"));
			highlight(ele);
			ele.sendKeys("9840783273");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@id='input_1']")).sendKeys("arun");
			Thread.sleep(2500);
			System.out.println("Entered frame and values entered");
			driver.switchTo().defaultContent();//moving control to top window i.e out of frame
/*			driver.findElement(By.xpath("//a[text()='X']")).click();
			System.out.println("Close button clicked");*/
			WebElement close = driver.findElement(By.xpath("//a[text()='X']"));//clicking the close button using xpath
			highlight(close);
			Thread.sleep(4000);
			close.click();
			
		}
	public static void highlight(WebElement element) throws InterruptedException
	{
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("arguments[0].style.backgroundColor = 'Yellow'", element);
		jsx.executeScript("arguments[0].style.border='3px Solid Red'", element);
	}

	}


