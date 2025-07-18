package org.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UnderstandingTheTestNG {
	//@Test(priority=3)                                                                                                         //priority is the helper attribute default priority is zero
	@Test(dependsOnMethods= {"test3","test2"})
	public void test1()
	{
		Reporter.log("test1()",true);                                                                                     //instead of solpn we use reporter.log() wher reporter is class and log is method which accepts the string value
		Reporter.log("Launching selenium official website");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.quit();
	}
	@Test()
	public void test2()
	{
		Reporter.log("test2()",true);
		Reporter.log("Launching java official website");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.java.com/en/");
		driver.quit();
	}
	
	@Test
	//@Test(priority=-5,invocationCount=3,threadPoolSize=3)                                                                                          //invocation count means that test run how many times deafult is 1
	public void test3()
	{
		Reporter.log("test3()",true);
		Reporter.log("Lunching Jmeter official website");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jmeter.apache.org/");
		driver.quit();	
		}

}
