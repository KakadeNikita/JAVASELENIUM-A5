package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement dateDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select select=null;
		
		  select = new Select(monthDropdown);
		List<WebElement> monthOptions = select.getOptions();
		for(WebElement m:monthOptions)
		{
			String value = m.getAttribute("value");
			select.selectByValue(value);
			Thread.sleep(1000);
			
		}
		
		 select=new Select(dateDropdown);
		 List<WebElement> dateOptions = select.getOptions();
		 int i=0;
		 for(WebElement d:dateOptions)
		 {
			select.selectByIndex(i);
			i++;
			
		 }
		 select=new Select(yearDropdown);
		 List<WebElement> yearOptions = select.getOptions();
		 for(WebElement y:yearOptions)
		 {
			 String text = y.getText();
			select.selectByVisibleText("text");
		 }
		 
				
		
	}

}
