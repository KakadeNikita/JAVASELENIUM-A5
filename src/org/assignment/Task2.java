package org.assignment;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
	    String ExpectedUrl="https://www.swiggy.com/";
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.swiggy.com/");
	
		
		Dimension actualSize=driver.manage().window().getSize();
		
		Dimension targetSize = new Dimension(600,1400);
		driver.manage().window().setSize(targetSize);
		Point targetPosition=new Point(-8,-8);
		driver.manage().window().setPosition(targetPosition);
		driver.switchTo().newWindow(WindowType.WINDOW);
	
		
		driver.get("https://www.zomato.com/");
		
		driver.manage().window().maximize();
        Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowid: allWindowIds)
		{
			
			driver.switchTo().window(windowid);
			
			if(driver.getCurrentUrl().equals(ExpectedUrl)) {
			break;
			}
		}
		driver.close();
		
		
		
		
		
	
	
	}

}
