package org.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vicky {
	@Test(groups= {"Bollywood"})
	public void launchingVickyWikipedia()
	{
		
		Reporter.log("Launching Vicky wikipedia page");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Vicky_Kaushal");
		driver.quit();
	}

}
