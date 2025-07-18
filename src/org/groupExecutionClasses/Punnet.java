package org.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Punnet {
	@Test(groups= {"SFS"})
	public void launchingPunnetWikipedia()
	{
		
		Reporter.log("Launching punnet wikipedia page");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
		driver.quit();
	}

}
