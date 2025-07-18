package org.webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchingTheTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.zomato.com/");
		driver.get("https://www.fossil.com/en-in/");
		
		String title=driver.getTitle();
		System.out.println(title);
	}

}
