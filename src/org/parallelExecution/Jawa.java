package org.parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class Jawa {
	
	public void launch42Bobber()
	{
		
		Reporter.log("Launching 42Bobber official website");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/motorcycles/42-bobber");
		driver.quit();
	}
	@Test
	public void launchPerak() {
		Reporter.log("Launching perak official website");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/motorcycles/perak");
		driver.quit();
	}
	
	
}
