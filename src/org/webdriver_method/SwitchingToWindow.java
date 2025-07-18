package org.webdriver_method;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToWindow {
	public static void main(String[] args) throws InterruptedException {
		String expectedUrl="https://www.zomato.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		driver.get("https://www.zomato.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		driver.get("https://shariefbhai.com/");
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowid: allWindowIds)
		{
			Thread.sleep(2000);
			driver.switchTo().window(windowid);
			
			if(driver.getCurrentUrl().equals(expectedUrl)) {
			break;
			}
		}
		
		
		
		
		
	}

}
