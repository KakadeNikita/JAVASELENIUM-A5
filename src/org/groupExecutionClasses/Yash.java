package org.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yash {
	@Test(groups= {"SFS","PanIndia"})
	public void launchingYashWikipedia()
	{
		
		Reporter.log("Launching Yash  wikipedia page");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Yash_(actor)");
		driver.quit();
	}

}
