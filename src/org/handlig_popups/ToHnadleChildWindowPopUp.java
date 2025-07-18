package org.handlig_popups;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHnadleChildWindowPopUp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		String ParentWindowId = driver.getWindowHandle();
		System.out.println(ParentWindowId);
		
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		allWindowIds.remove(ParentWindowId);
		System.out.println(allWindowIds);
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("nextStep")).click();
		driver.findElement(By.id("userName")).sendKeys("Nikita");
		driver.findElement(By.id("accountNo")).sendKeys("1273456789");
		WebElement CountryDropDown = driver.findElement(By.id("selCountry"));
		Select select=new Select(CountryDropDown);
		select.selectByVisibleText("India");
		driver.findElement(By.id("mobileNo")).sendKeys("7741066533");
		driver.findElement(By.id("datepicker5")).sendKeys("04/09/2001");
		driver.findElement(By.id("loginCaptchaValue")).sendKeys("27y3");
		driver.findElement(By.id("go")).click();
		
		
	}

}
