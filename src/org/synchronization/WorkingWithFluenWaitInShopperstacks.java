package org.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithFluenWaitInShopperstacks {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		  FluentWait wait = new FluentWait (driver);
		           wait.withTimeout(Duration.ofSeconds(30));
		            wait.pollingEvery(Duration.ofSeconds(5));
		            wait.ignoring(Exception.class);
		driver.get("https://shoppersstack.com/products_page/23");
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		WebElement checkButton = driver.findElement(By.xpath("//button[text()='Check']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();

}
}
