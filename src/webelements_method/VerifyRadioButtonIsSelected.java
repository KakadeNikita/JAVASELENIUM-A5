package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRadioButtonIsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/input"));
		WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/input"));
		WebElement customGenderTextBox = driver.findElement(By.id("custom_gender"));
		//System.out.println(maleRadioButton.isDisplayed());
		if(!maleRadioButton.isSelected())
		{
			maleRadioButton.click();
		}
		Thread.sleep(2000);
		if(!customGenderTextBox.isDisplayed())
		{
			customRadioButton.click();
		}
		
		
	}

}
