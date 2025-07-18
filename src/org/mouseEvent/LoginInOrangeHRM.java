package org.mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginInOrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		WebElement useNameTextBox =driver.findElement(By.name("username"));
		WebElement passwordTextBox = driver.findElement(By.name("password"));
		//actions.sendKeys(useNameTextBox, "Admin").perform();
		actions.moveToElement(useNameTextBox).sendKeys("Admin").perform();
		
		//actions.sendKeys(passwordTextBox, "admin123",Keys.ENTER).perform();
		actions.moveToElement(passwordTextBox).click().sendKeys("admin123",Keys.ENTER).perform();
		

}
}
