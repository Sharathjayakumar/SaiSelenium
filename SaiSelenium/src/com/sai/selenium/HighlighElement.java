package com.sai.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HighlighElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		//driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		Thread.sleep(5000);

/*		WebElement Source = driver.findElement(By.id("fromPlaceName"));

		highlightElement(Source);
		Source.sendKeys("Trichy");
		
		WebElement Dest = driver.findElement(By.id("toPlaceName"));

		highlightElement(Dest);
		Source.sendKeys("Chennai");
		
		WebElement lady = driver.findElement(By.id("singleLady"));
		highlightElement(lady);
		lady.click();*/
		
		String baseXpath = "//div[h2[text()='Popular Routes']]/ul[1]/li";
		for(int i=1;i<=32;i++)
		{
			String updatedXpath = baseXpath + "["+i+"]/a";
			
			WebElement PopularRoute = driver.findElement(By.xpath(updatedXpath));
			highlightElement(PopularRoute);
			System.out.println(PopularRoute.getText());
			deHighlightElement(PopularRoute);
		}
	}

	public static void deHighlightElement(WebElement element) throws InterruptedException
	{
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("arguments[0].style.backgroundColor = ''", element);
		jsx.executeScript("arguments[0].style.border=''", element);
	}
	
	
	public static void highlightElement(WebElement element) throws InterruptedException
	{
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("arguments[0].style.backgroundColor = 'Yellow'", element);
		jsx.executeScript("arguments[0].style.border='3px Solid Red'", element);

		
		/*for(int i=1;i<=5;i++)
		{
			if(i<=4)
			{
				jsx.executeScript("arguments[0].style.backgroundColor = 'Yellow'", element);
				jsx.executeScript("arguments[0].style.border='3px Solid Red'", element);
			}
			else
			{
				jsx.executeScript("arguments[0].style.backgroundColor = ''", element);
				jsx.executeScript("arguments[0].style.border=''", element);
			}
		}
		*/
		
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].style.backgroundColor = 'Yellow'", element);
		//((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px Solid Red'", element);
	}


}
