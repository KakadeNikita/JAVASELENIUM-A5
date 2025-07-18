package org.mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMouseHoverActionOnWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions action=new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Thread.sleep(1000);
		action.moveToElement(electronics).perform();
		
	}

}
