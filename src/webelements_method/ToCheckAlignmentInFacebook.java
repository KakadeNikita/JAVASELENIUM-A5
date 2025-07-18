package webelements_method;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckAlignmentInFacebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		 Dimension emailTextBoxSize = emailTextBox.getSize();
		Point emailTextBoxLocation = emailTextBox.getLocation();
		
		WebElement passwordTextBox = driver.findElement(By.id("passContainer"));
		Dimension passwordTextBoxSize = passwordTextBox.getSize();
		Point passwordTextBoxLocation = passwordTextBox.getLocation();
		
		int leftAlignmentDifference=emailTextBoxLocation.getX()-passwordTextBoxLocation.getX();
		if( leftAlignmentDifference>-3&& leftAlignmentDifference<3)
		{
			System.out.println("Left allignment is proper");
		}
		else
		{
			System.out.println("Left allignment is not proper");
		}
		
		int rightAllignmentDifference=(emailTextBoxLocation.getX()+emailTextBoxSize.getWidth())-(passwordTextBoxLocation.getX()+passwordTextBoxSize.getWidth());
		if(rightAllignmentDifference>-3&&rightAllignmentDifference<3)
		{
			System.out.println("Right allignmet is proper");
			
		}
		else
		{
			System.out.println("Right allignmet is not proper");
		}
		
		int overlappingDifference=passwordTextBoxLocation.getY()-(emailTextBoxLocation.getY()+emailTextBoxSize.getHeight());
		if(overlappingDifference>0)
		{
			System.out.println("not overlapped");
		}
		else
		{
			System.out.println("overlapped");
		}
		
		
		

}
}