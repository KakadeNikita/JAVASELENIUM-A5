package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginUsingXpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("Nikita");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
