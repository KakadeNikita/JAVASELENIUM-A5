package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatingSymbolInAmazon {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 5c");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//div[text()='Apple iPhone 5C (Yellow, 8 GB)']/../../..//*[name()='svg']")).click();
		//WebElement ele = driver.findElement(By.xpath("(//div[text()='Apple iPhone 5C (Yellow, 8 GB)']/../..//div[contains(text(),'₹')])[1]"));
	    //System.out.println(ele.getText());
		WebElement ele = driver.findElement(By.xpath("(//div[text()='Apple iPhone 5C (White, 32 GB)']/../..//div[contains(text(),'₹')])[1]"));
		
		System.out.println(ele.getText());
		
		
	}
	

}
