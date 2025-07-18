package org.mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformActionsOnILovePdf {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Actions action=new Actions(driver);
		//action.contextClick().perform();
		WebElement button = driver.findElement(By.id("pickfiles"));
		//action.contextClick(button).perform();
		action.moveToElement(button).contextClick().perform();
		
		

}
}
