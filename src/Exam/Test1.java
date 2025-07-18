package Exam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		String expectedURL = "https://www.swiggy.com/";
		driver.get("file:///C:/Users/Nikita%20Kakade/Downloads/Assign.html");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Set<String> AllWindowId = driver.getWindowHandles();
		
		
		
		
		for(String windowid:AllWindowId)
		{
			driver.switchTo().window(windowid);
			if(driver.getCurrentUrl().equals(expectedURL)) {
				break;
					
		}
			
		}
		}
	}

		
		
	
			
		
		
		
		
	


