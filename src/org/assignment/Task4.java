package org.assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
//		System.out.println(driver.getTitle());
//		String windowId = driver.getWindowHandle();
//		System.out.println(windowId);
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
//	    driver.navigate().to("https://www.zomato.com/");
//	    driver.navigate().to(new URL("https://www.zomato.com/"));
	    driver.manage().window().maximize();
	    driver.switchTo().activeElement().sendKeys("hi");
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://in.bookmyshow.com/");
	    Thread.sleep(2000);
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.amazon.com/");
		
	}

}
