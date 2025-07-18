package org.takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingTheScreenShotOfWebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		LocalDateTime ldt=LocalDateTime.now();//localdatetime is class we cananot create an object of this class use factory method
		String timeStamp=ldt.toString().replace(":", "-");
		driver.manage().window().maximize();
		driver.get("https://cadburygifting.in/personalised-gifts.html");
		WebElement product = driver.findElement(By.xpath("//div[text()='Cadbury Personalised Nostalgia Chocolate Box']/../../../.."));
		File screenshot = product.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorshot/screenshot"+timeStamp+".png");
		FileHandler.copy(screenshot, dest);
	}

}
//"//a[contains(text(), 'Cadbury Personalised Heart Gift Box')]/../.. /../..    "