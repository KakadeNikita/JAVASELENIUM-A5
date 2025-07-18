package org.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SRK {
	@Test(groups= {"bollywood","PanIndia"})
	public void launchingSRK()
	{
		
		Reporter.log("Launching SRK  wikipedia page");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Shah_Rukh_Khan");
		driver.quit();
	}

}
