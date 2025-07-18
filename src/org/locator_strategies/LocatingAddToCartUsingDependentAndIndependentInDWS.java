package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAddToCartUsingDependentAndIndependentInDWS {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()='Casual Golf Belt']/../../../..//input[@type='button']")).click();
		
	}

}
