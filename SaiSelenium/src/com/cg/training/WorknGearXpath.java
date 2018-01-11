package com.cg.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorknGearXpath {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*		driver.get("https://www.workngear.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@class='top-level col-lg-12']/li[2]/h2[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='main-content col-lg-9 col-md-12 col-sm-12 col-xs-12']/div[1]/div[5]")).click();
		Select dropdown = new Select(driver.findElement(By.xpath("//div[@class='top-pagination-content col-lg-12']/div[1]/div[2]/fieldset[1]/select[1]")));
		dropdown.selectByVisibleText("Name (Ascending)");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='col-lg-9 col-md-12 col-sm-12 col-xs-12']/ul[1]/li[2]/div[2]/ul[1]/div[1]/div[1]/li[1]")).click();
		driver.findElement(By.xpath("//div[@class='col-lg-9 col-md-12 col-sm-12 col-xs-12']/ul[1]/li[2]/h4[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//form[@class='js-product-form']/div[1]/div[1]/label[1]/span[1]")).click();
		driver.findElement(By.xpath("//fieldset[@class='product-detail-option product-detail-option1']/ul[1]/li[5]/label[1]/span[2]")).click();
		driver.findElement(By.xpath("//fieldset[@class='product-detail-option product-detail-option2']/ul[1]/li[2]/label[1]/span[2]")).click();
		driver.findElement(By.xpath("//div[@class='product-detail-options js-product-options']/fieldset[4]/div[1]/i[1]/i[1]")).click();
		driver.findElement(By.xpath("//button[@id='wngbtnadd2cart']")).click();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//ul[@class='top-links inline col-lg-8']/li[7]/a[1]/div[1]/span[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript();
		element.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='hide-mobile col-lg-3']/form[1]/input[5]")).click();

		 */

		driver.get("https://www.workngear.com/product/women/Scrubology-Women-s-Stretch-V-Neck-Scrub-Top/ST006SCR/_/A-40926745");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("kkk")).getText();
		
		driver.findElement(By.xpath("//span[@style='background: url(\"https://images.workngear.com/images/product/swatch/ST006SCR_4WNE.jpg\") center center no-repeat;']")).click();
		
		System.out.println("Test");
		driver.findElement(By.xpath("//span[@title='Small']")).click();
		

		WebElement elem = driver.findElement(By.xpath("//div[@style='display: block;']"));

		System.out.println(elem.getText());
		



	}

}
