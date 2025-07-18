package org.webdriver_method;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingAndChagingThePositionOfTheBrowser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Point actualPosition=driver.manage().window().getPosition();
		System.out.println("X :"+actualPosition.getX());
		System.out.println("Y :"+actualPosition.getY());
		
		Point targetPosition=new Point(100,600);
		driver.manage().window().setPosition(targetPosition);
	}

}
