package org.assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.swiggy.com/");
		String SwiggyId=driver.getWindowHandle();
		
		Dimension actualSize=driver.manage().window().getSize();
		
		Dimension targetSize = new Dimension(600,1400);
		driver.manage().window().setSize(targetSize);
		Point targetPosition=new Point(-8,-8);
		driver.manage().window().setPosition(targetPosition);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.zomato.com/");
		driver.switchTo().window(SwiggyId).close();
		driver.manage().window().maximize();
		
	}

}
