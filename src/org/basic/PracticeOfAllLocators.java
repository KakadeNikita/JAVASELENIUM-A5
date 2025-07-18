package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOfAllLocators {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		driver.findElement(By.cssSelector("img[alt='Picture for category Desktops']")).click();
		driver.findElement(By.cssSelector("img[title='Show details for Build your own cheap computer']")).click();
		driver.findElement(By.partialLinkText("JEWELRY")).click();
		driver.findElement(By.cssSelector("img[alt='Picture of Vintage Style Three Stone Diamond Engagement Ring']")).click();
		
	}

}
