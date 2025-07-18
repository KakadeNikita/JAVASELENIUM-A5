package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingLoginButtonInDWS {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nikitakakade2324@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("nikita2324");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}

}
