package org.select_Class_Method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScrrenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//step1:convert driver ref into TakesScreenshot type
		TakesScreenshot ts=(TakesScreenshot)driver;
		//Step2:call getScreenshotAs()-->store the file
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		//Step3:create a new file and copy the image
		File dest=new File("C:\\Users\\Nikita Kakade\\Desktop\\ABC.png");
		FileHandler.copy(screenshot, dest);

}
}
