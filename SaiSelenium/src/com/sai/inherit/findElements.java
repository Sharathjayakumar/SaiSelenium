package com.sai.inherit;

import org.openqa.selenium.By;

public class findElements extends hitURL{

	public void elementFind()
	{
		driver.findElement(By.id("q")).sendKeys("Driver");
	}
}
