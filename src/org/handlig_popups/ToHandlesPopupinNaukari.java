package org.handlig_popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlesPopupinNaukari {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Nikita Kakade\\Desktop\\Sample_Script.exe");

}
}



