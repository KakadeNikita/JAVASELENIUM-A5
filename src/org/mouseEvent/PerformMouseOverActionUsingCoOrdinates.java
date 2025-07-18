package org.mouseEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMouseOverActionUsingCoOrdinates {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions action=new Actions(driver);
		
		action.moveByOffset(461,167).perform();
		Thread.sleep(2000);
		action.moveByOffset(749-461,0).perform();
		

}
}
