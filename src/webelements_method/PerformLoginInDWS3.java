package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformLoginInDWS3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("nikita2324",Keys.CONTROL+"a");
		Thread.sleep(2000);
		emailTextBox.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		emailTextBox.sendKeys(Keys.TAB,Keys.CONTROL+"v");
		emailTextBox.clear();
		

}
}
