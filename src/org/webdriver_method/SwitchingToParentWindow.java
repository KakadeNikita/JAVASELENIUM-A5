package org.webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToParentWindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigating into zomato
		driver.get("https://www.zomato.com/");
		//fetching window id of the main tab
		String parentWindowId=driver.getWindowHandle();
		//to open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		//navigating into the amazon
		driver.get("https://www.amazon.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.bookmyshow.com/");
		//switching back to the main tab
		driver.switchTo().window(parentWindowId);
	}
	

}
