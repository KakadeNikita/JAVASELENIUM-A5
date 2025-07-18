package org.testScript;

import org.generic_utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddSmartPhoneToCart extends BaseTest {
	@Test
	public void verify_smart_phone_is_added_to_cart() {
		String expectedTitleElectronicsPage="Demo Web Shop. Electronics";
		//String expectedTitleCellPhonesPage="Demo Web Shop. Cell phones";
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		String actualTitleofElectronicsPage=driver.getTitle();
		Assert.assertEquals(actualTitleofElectronicsPage, expectedTitleElectronicsPage,"Title is not matching" );
		Reporter.log("Electronics page Displayed");
		driver.findElement(By.partialLinkText("Cell phones")).click();
	//	String actualTitleofCellPhonesPage=driver.getTitle();
		//Assert.assertEquals(actualTitleofCellPhonesPage, expectedTitleCellPhonesPage,"Title is not matching" );
		Assert.assertTrue(driver.getTitle().contains("Cell phones"), "doesnot contains cell phones");
		driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']")).click();
		WebElement notification = driver.findElement(By.className("content"));
		String expectedAddToCartMsg="The product has been added to your shopping cart";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(notification.getText(),expectedAddToCartMsg,"not maching");
		System.out.println("***********");
		System.out.println("not stopped");
		sa.assertAll();
		
		
		
		
	}

}
