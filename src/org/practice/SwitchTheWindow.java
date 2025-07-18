package org.practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTheWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String expectedURL="https://www.swiggy.com/";
		driver.get("https://www.zomato.com/");
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		Set<String> AllWindowId = driver.getWindowHandles();
		System.out.println(AllWindowId);
		for(String WindowIds:AllWindowId)
		{
			driver.switchTo().window(WindowIds);
			if(driver.getCurrentUrl().equals(expectedURL))
				break;
		}
		
	}

}
