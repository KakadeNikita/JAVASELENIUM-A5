package webelements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchAttributesValueInFB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String email="nikitakakade2324@gmail.com";
		Thread.sleep(2000);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys(email);
		String enteredEmail=emailTextBox.getAttribute("value");
		if(enteredEmail.equals(email))
		{
			System.out.println("Email Entered Successfully");
		}
		else {
			System.out.println("Email is not Entered Properly");
		}
		

}
}
