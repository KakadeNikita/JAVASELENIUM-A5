package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingVAlueFunction {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement disabledTextBox = driver.findElement(By.id("tb2"));
		jse.executeScript("arguments[0].value='Nikita';",disabledTextBox);

}
}
