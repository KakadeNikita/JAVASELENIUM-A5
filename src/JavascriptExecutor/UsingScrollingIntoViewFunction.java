package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingScrollingIntoViewFunction {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement addToCartButton = driver.findElement(By.xpath("//a[text()='Simple Computer']/../..//input[@value='Add to cart']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeAsyncScript("arguments[0].scrollIntoView(true)",addToCartButton);//if there is one element we use argument[0] if we have the list of element then we use the more numbers in the arguments
	}

}
