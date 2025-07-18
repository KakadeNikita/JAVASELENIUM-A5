package org.handlig_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleThePromptPopUpInOmayo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("prompt")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.sendKeys("Nikita");
		Thread.sleep(2000);
		alert.accept();
		
	}
	

}
