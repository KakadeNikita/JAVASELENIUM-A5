package org.webdriver_method;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenTabs {
	public static void main(String[] args) throws InterruptedException {
		//String expectedUrl="https://www.fossil.com/en-in/";
		String expectedTitle="Fossil IN - The Official Site for Fossil Watches, Handbags, Jewelry & Accessories";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://jokerandwitch.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.fossil.com/en-in/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.rolex.com/en-us");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		driver.get("https://www.fastrack.in/");
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		for(String windowid: allWindowIds)
		{
			Thread.sleep(2000);
			driver.switchTo().window(windowid);
//			
//			if(driver.getCurrentUrl().equals(expectedUrl)) {
//			break;
//			}
			if(driver.getTitle().equals(expectedTitle)) {
				break;
				}
			}
		
		
		
		
		
		
		
	}

}
