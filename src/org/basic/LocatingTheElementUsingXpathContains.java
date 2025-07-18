package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTheElementUsingXpathContains {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.linkText("Fashion")).click();
		driver.findElement(By.xpath("//img[@alt='ZILVIRA Woven Kanjivaram Jacquard, Art Silk Saree']")).click();
	}

}
