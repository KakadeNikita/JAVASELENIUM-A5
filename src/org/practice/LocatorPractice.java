package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LocatorPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 5c");
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
		WebElement price = driver.findElement(By.xpath("(//div[text()='Apple iPhone 5C (Yellow, 8 GB)']/../..//div[contains(text(),'₹')])[1]"));
		System.out.println(price.getText());
	}

}
