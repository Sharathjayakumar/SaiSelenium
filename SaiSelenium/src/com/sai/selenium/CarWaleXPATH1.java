package com.sai.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarWaleXPATH1 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.carwale.com/");
		
		driver.findElement(By.xpath("//div[@class='header-landing  main-nav-header']/nav[1]/div[1]/ul[1]/li[1]/div[1]/span[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='grid-8 font15 text-black']/div[1]/ul[1]/li[3]/a[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='cwsprite cross-sm-white position-abt pos-right5 pos-top10 expert-close-btn']")).click();
		
		
		WebElement element = driver.findElement(By.xpath("//div[@class='dropDowncontainer']/div[3]/div[1]/div[1]/div[2]/div[2]/select[1]"));

		boolean b = element.isDisplayed();
		System.out.println(b);
		b= element.isEnabled();
		System.out.println(b);
		
		new Select(element).selectByIndex(1);
		
		Thread.sleep(2222);
		
		Select Car1 = new Select(element);
		
		//int counter = new Select(element).getOptions().size();
		
		int count = Car1.getOptions().size();
		
		System.out.println(count);
		
		List<WebElement> options = Car1.getOptions();
		for(WebElement option:options) {
			//System.out.println("------>Make1<------");
			System.out.println(option.getText());
		}

		WebElement element2 = driver.findElement(By.xpath("//div[@class='dropDowncontainer']/div[3]/div[1]/div[1]/div[2]/div[3]/select[1]"));
		
		b=element2.isDisplayed();
		System.out.println(b);
		
		b=element2.isEnabled();
		System.out.println(b);
		
		Select Model = new Select(element2);
		
		int modelCount = Model.getOptions().size();
		
		System.out.println(modelCount);
		
		List<WebElement> SecondDrop = Model.getOptions();
		
		for(WebElement option1:SecondDrop ) {
			//System.out.println("------>Models<------");
			System.out.println(option1.getText());
		}
		
		Model.selectByValue("1051");
		
		Thread.sleep(2000);
		
		WebElement Element3 = driver.findElement(By.xpath("//div[@class='dropDowncontainer']/div[3]/div[1]/div[1]/div[2]/div[4]/select[1]"));
		
		b=Element3.isDisplayed();
		System.out.println(b);
		
		b=Element3.isEnabled();
		System.out.println(b);
		
		Select version = new Select(Element3);
		
		int versionSize=version.getOptions().size();
		System.out.println(versionSize);
		
		List<WebElement> versionOpt = version.getOptions();
		
		for(WebElement vOptions:versionOpt) {
			
			//System.out.println("------>Versions<------");
			System.out.println(vOptions.getText());
		}
		
		version.selectByVisibleText("Evolution");
		Thread.sleep(2000);
		
//--------------------------------------------------------------XPATH2--------------------------
		WebElement car2 = driver.findElement(By.xpath("//select[@name='drpMake2']"));
		
		new Select(car2);
		
		b=car2.isDisplayed();
		System.out.println(b);
		b=car2.isEnabled();
		System.out.println(b);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='drpMake2']/option[13]")).click();
		
		Select carMake2 = new Select(car2);
		
		int countC2=carMake2.getOptions().size();
		
		System.out.println("Count of Car2 is:"+countC2);
		
		List<WebElement> car2options = carMake2.getOptions();
		
		for(WebElement caroptions2:car2options) {
			
			System.out.println(caroptions2.getText());
//---------------------------------------------------------------------------
			
			
			
		}
		
	}

}
