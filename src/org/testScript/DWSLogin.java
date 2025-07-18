package org.testScript;

import java.time.Duration;

import org.generic_utilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLogin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Flib.readDataFromProperties("url"));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Flib.readDataFromProperties("email"));
		driver.findElement(By.id("Password")).sendKeys(Flib.readDataFromProperties("password"),Keys.ENTER);
	}

}
