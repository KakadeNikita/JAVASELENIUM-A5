package org.mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDragAndDropInDhtml {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement capital = driver.findElement(By.id("box3"));
		WebElement country = driver.findElement(By.id("box103"));
		String color=capital.getCssValue("background-color");
		System.out.println(color);
		Actions action=new Actions(driver);
		action.dragAndDrop(capital, country).perform();
		color=capital.getCssValue("background-color");
		System.out.println(color);
		
		
		

}
}
