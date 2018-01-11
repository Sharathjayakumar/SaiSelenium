package com.sai.selenium;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CaptureScreenShot {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		//System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		//driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "D:\\Local C\\Downloads\\IE Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		Thread.sleep(5000);

		//Below Commented code to understand normal Screen shot
		
		WebElement Source = driver.findElement(By.id("fromPlaceName"));

		highlightElement(Source);
		Source.sendKeys("Trichy");
		Source.sendKeys(Keys.TAB);
		takeSnap("Sources.png");

		/*WebElement Dest = driver.findElement(By.id("toPlaceName"));
		highlightElement(Dest);
		Dest.sendKeys("Chennai");
		Dest.sendKeys(Keys.TAB);

		takeSnap("Dest");
		*/
		//Below code is to understand particular Screen shot
		/*String Envr = driver.getCurrentUrl();
		boolean Dev = Envr.contains("dev");
		if(Dev)
		{
			String DevEnvr = "DevEnvr";
		}*/
/*
		WebElement BaseRouteElements = driver.findElement(By.xpath("//div[@id='booking-right']"));
		captureParticular("PartialPicture", BaseRouteElements);
		
		WebElement Route = driver.findElement(By.xpath("//h2[text()='Popular Routes']/../.."));
		captureParticular("BusRoute", Route);*/
		
		/*driver.get("https://www.google.co.in/search?q=Dhoni+Six&dcr=0&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjNwJORreDWAhUILo8KHStyD7cQ_AUICygC&biw=1366&bih=628");
		Thread.sleep(5000);
		WebElement BaseDhoniImg = driver.findElement(By.id("rg"));
		
		List<WebElement> DhoniAllImage=BaseDhoniImg.findElements(By.xpath("//img[@class='rg_ic rg_i']"));
		int count=0;
		for(WebElement dhoni:DhoniAllImage)
		{
			count=count+1;;
			captureParticular("Dhoni"+count, dhoni);
		}*/
		
		
	}

	public static void takeSnap(String filename) throws Throwable
	{
		File picture = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(picture, new File("E:\\SeleniumScreenshots\\"+filename));	
	}


	public static void captureParticular(String fileName, WebElement element) throws IOException
	{
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Point p = element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		Rectangle rect = new Rectangle(width, height);
		BufferedImage img = ImageIO.read(screen);
		BufferedImage cropImage = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height);
		ImageIO.write(cropImage, "jpg", screen);
		FileUtils.copyFile(screen,new File("C:\\Users\\Venkataramani\\Desktop\\Sep_2017_ Selenium\\TakeSnap\\"+fileName+".png"));
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

	}

}
