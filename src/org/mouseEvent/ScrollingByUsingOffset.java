package org.mouseEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByUsingOffset {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zeptonow.com/");
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 800).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0,-200).perform();
		

}
}
