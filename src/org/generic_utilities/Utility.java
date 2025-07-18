package org.generic_utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void captureScreenshot(WebDriver driver)
	{
		LocalDateTime ldt=LocalDateTime.now();
		String timeStamp=ldt.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./errorshot/screenshot"+timeStamp+".png");
		try {
			FileHandler.copy(screenshot, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
