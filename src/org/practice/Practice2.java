package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Practice2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement carDropDown = driver.findElement(By.id("multiselect1"));
		Select select=new Select(carDropDown);
		List<WebElement> Aso = select.getOptions();
		for(WebElement option:Aso)
		{
			select.selectByValue(option.getAttribute("value"));
		}
		select.deselectByIndex(1);
		select.deselectByVisibleText("Audi");
		List<WebElement> AllSelected = select.getAllSelectedOptions();
		for(WebElement allSelected:AllSelected)
		{
			System.out.println(allSelected.getText());
		}
		
		
		
		  
		
		
	}

	

}
