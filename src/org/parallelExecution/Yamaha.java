package org.parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yamaha {
	@Test
	public void launchR1() {
		Reporter.log("Launching R1 official website");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/yamaha-bikes/r1/");
		driver.quit();
	}

}
