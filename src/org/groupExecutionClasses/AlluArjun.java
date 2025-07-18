package org.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlluArjun {
	@Test(groups={"TFS","PanIndia"})
	public void launchingHarleyBike()
	{
		
		Reporter.log("Launching Allu Arjun  wikipedia page");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
		driver.quit();
	}
	

}
