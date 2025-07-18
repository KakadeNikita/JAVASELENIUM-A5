package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementUsingXpathByLogicalAnd {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nikita%20Kakade/Desktop/LogicalOperator.html");
		driver.findElement(By.xpath("//input[@value='M' and @name='Gender']")).click();
	}

}
