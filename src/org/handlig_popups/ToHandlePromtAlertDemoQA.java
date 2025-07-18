package org.handlig_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandlePromtAlertDemoQA {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		WebElement promtButton = driver.findElement(By.id("promtButton"));
		Actions actions=new Actions(driver);
		actions.scrollToElement(promtButton).scrollByAmount(0, 200).click(promtButton).perform();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Nikita");
		alert.accept();
		


}
}
