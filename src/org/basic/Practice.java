package org.basic;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
     	driver.get("https://www.flipkart.com/");
     	driver.findElement(By.name("q")).sendKeys("iphone5c",Keys.ENTER);
        WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 5C (White, 32 GB)']/../..//div[contains(text(),'₹')]"));
        System.out.println(price.getText());
        
        
        
     	
     	
     	
     	//		driver.findElement(By.xpath("//span[contains(text(),'Search for')]")).click();
//		driver.findElement(By.name("q")).sendKeys("saari");
//		driver.findElement(By.xpath("(//button[contains(@class,'search__button')])[1] //*[name()='svg']")).click();
		
//	   
	  
	}

}
