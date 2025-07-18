package org.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MaheshBabu {
	@Test(groups= {"TFS"})
	public void launchingMaheshBabu()
	{
		
		Reporter.log("Launching Mahesh babu  wikipedia page");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Mahesh_Babu");
		driver.quit();
	}

}
