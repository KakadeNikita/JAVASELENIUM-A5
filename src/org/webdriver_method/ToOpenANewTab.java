package org.webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenANewTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		//to open a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		//to open a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://in.bookmyshow.com/");
		
	}

}
