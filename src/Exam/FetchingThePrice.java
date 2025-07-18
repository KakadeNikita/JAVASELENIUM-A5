package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchingThePrice {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16");
		driver.findElement(By.id("nav-search-submit-text")).click();
		WebElement price = driver.findElement(By.xpath("//span[text()='iPhone 16 512 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Pink']/../../../..//span[@class='a-price-whole']"));
		System.out.println(price.getText());
		driver.findElement(By.xpath("//span[text()='iPhone 16 512 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Pink']/../../../..//button[text()='Add to cart']")).click();
		
	}

}
