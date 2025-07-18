package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformLoginInDWS4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextBox=driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("nikitakakade2324@gamil.com",Keys.TAB,"nikita2324");
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
		
		
	}

}
