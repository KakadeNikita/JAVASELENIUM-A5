package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchThePriceOfProduct {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Best phones under 5000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		 String price=driver.findElement(By.xpath("//span[contains(text(),'Nokia 2660 Flip 4G') and contains(text(),'Red')]/../../../..//span[contains(@class,'a-price-whole')]")).getText();
         System.out.println(price);
         driver.findElement(By.xpath("//span[contains(text(),'Nokia 2660 Flip 4G') and contains(text(),'Red')]/../../../..//button[text()='Add to cart']")).click();
         
		
	}

}
