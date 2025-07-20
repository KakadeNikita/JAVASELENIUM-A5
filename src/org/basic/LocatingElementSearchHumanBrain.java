package org.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingElementSearchHumanBrain {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Watches for women",Keys.ENTER);
		//String price = driver.findElement(By.xpath("//a[text()='Analog Watch  - For Women Latest Designer Printed Dial ...']/..//div[contains(text(),'₹')][1]")).getText();
		//System.out.println(price);
		driver.findElement(By.xpath("//a[text()='Analog Watch  - For Women Latest Designer Printed Dial ...']")).click();
		
		
	}

}
