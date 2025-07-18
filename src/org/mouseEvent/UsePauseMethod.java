package org.mouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsePauseMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement capital = driver.findElement(By.id("box1"));
		WebElement country = driver.findElement(By.id("box101"));
		Actions actions=new Actions(driver);
		//actions.clickAndHold(capital).release(country).perform();
		actions.moveToElement(capital).clickAndHold().pause(3).moveToElement(country).pause(Duration.ofSeconds(2)).release().perform();

}
}
