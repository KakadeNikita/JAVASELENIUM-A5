package org.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchingTheSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("https://www.google.com/");
		String googleid = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		String amzonID = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		driver.switchTo().window(googleid).close();
		Thread.sleep(1000);
		driver.switchTo().window(amzonID);
		
		driver.manage().window().maximize();
		
		
		
//		
//			
		
		
		
		
		
	}

}
