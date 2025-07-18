package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformLiginInFacebook {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement facebookLogin = driver.findElement(By.id("email"));
		
		facebookLogin.sendKeys("nikitakakade2324@gmail.com",Keys.TAB,"Nikita@123");
		driver.findElement(By.name("login")).submit();
}
}
