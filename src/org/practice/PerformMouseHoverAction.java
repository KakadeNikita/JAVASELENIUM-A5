package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMouseHoverAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	//	driver.get("https://www.suzukimotorcycle.co.in/");
		Actions actions=new Actions(driver);
		//WebElement products = driver.findElement(By.partialLinkText("PRODUCTS"));
		//actions.moveToElement(products).perform();
		//actions.moveToElement(products).click().perform();
		//actions.click(products).perform();
		//590,201
		//actions.moveByOffset(450, 199).perform();
		//actions.moveByOffset(590-450, 0).perform();
		//actions.moveToLocation(450, 199).perform();
		//Thread.sleep(2000);
		//actions.moveToLocation(590, 199).perform();
		//offset is also known as delta
		WebElement computers = driver.findElement(By.partialLinkText("COMPUTERS"));
		actions.moveToElement(computers).perform();
	
	
		

}
}
