package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class LocatingTheElementByUsingTheDependentIndependent {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch for women");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String price=driver.findElement(By.xpath("(//span[contains(text(),', Glossy Metallic Finish, AMOLED Display, Mesh Metal and Leather Strap Options, 100+ Watch Faces, ')])[1]/../../../..//span[@class=\"a-price-whole\"]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("(//span[contains(text(),', Glossy Metallic Finish, AMOLED Display, Mesh Metal and Leather Strap Options, 100+ Watch Faces, ')])[1]/../../../..//button[text()='Add to cart']")).click();
	}

}
