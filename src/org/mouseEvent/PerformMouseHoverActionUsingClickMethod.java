package org.mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMouseHoverActionUsingClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/");
		Actions action=new Actions(driver);
		WebElement accessories = driver.findElement(By.partialLinkText("ACCESSORIES"));
		//action.contextClick();
	
		//action.click(accessories).perform();
		action.moveToElement(accessories).click().perform();
		

}
}
