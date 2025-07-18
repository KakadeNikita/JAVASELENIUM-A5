package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheRadioButtonIsSelectedOrNot {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement MaleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
		if(!MaleRadioButton.isSelected()) {
			MaleRadioButton.click();
		}
		
		
	}

}
