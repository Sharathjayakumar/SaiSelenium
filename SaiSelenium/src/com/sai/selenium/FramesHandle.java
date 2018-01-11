package Sep.batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesHandle {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.quackit.com/html/templates/frames/frames_example_3.html");
		Thread.sleep(5000);
		
		driver.switchTo().frame("topNav");//This is Code to Switch your control frame
		driver.findElement(By.linkText("Menu 2")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); //This is code used to exit from frame to Main HTML Page
		
		WebElement leftFrame = driver.findElement(By.xpath("//frame[@src='menu_1.html']"));
		driver.switchTo().frame(leftFrame);//This another way to entered into Frame
		
		driver.findElement(By.linkText("Green Page")).click();		
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); //This is code used to exit from frame to Main HTML Page
		
		driver.switchTo().frame(2);//Frame using Index
		driver.findElement(By.linkText("Back to original page")).click();
		
		
		
		
		

		
	}

}
