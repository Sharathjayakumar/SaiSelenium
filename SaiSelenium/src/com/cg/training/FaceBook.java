package com.cg.training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id='email']")).clear();
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sharathjayakumar@gmail.com");
		
		driver.findElement(By.cssSelector("input[id='pass'][type='password']")).clear();
		driver.findElement(By.cssSelector("input[id='pass'][type='password']")).sendKeys("456@Qwerty");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		/*driver.findElement(By.cssSelector("div[class='titlebarTextWrapper']")).click();*/
		
		driver.findElement(By.cssSelector("a[title='Profile']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a[href='https://www.facebook.com/sharathjayakumar/allactivity']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[type='text'][class='inputtext']")).sendKeys("Sharath");
		
		driver.findElement(By.cssSelector("button[title='Activity Search']")).click();
		
		
		
		
		
		
		
	}

}
