package org.testScript;

import java.time.Duration;

import org.generic_utilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationInDws {
	public static void main(String[] args)
	{
		String sheetName="Sheet1";
		String gender=Flib.readDataFromExcel(sheetName, 2, 0);
		String firstName=Flib.readDataFromExcel(sheetName,2, 1);
		String lastName=Flib.readDataFromExcel(sheetName,2, 2);
		String email=Flib.readDataFromExcel(sheetName,2, 3);
		String password=Flib.readDataFromExcel(sheetName,2, 4);
		//script
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Flib.readDataFromProperties("url"));
		driver.findElement(By.linkText("Register")).click();
		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
		WebElement femaleRadioButton = driver.findElement(By.id("gender-female"));
		if(gender.equals("Male"))
		{
			maleRadioButton.click();
		}
		else {
			femaleRadioButton.click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
		
	}
	
	

}
