package org.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDWS {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/Register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Nikita");
		driver.findElement(By.id("LastName")).sendKeys("Kakade");
		driver.findElement(By.id("Email")).sendKeys("nikitakakade2324@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("nikita2324");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("nikita2324");
		driver.findElement(By.id("register-button")).click();
		
		
	}

}
