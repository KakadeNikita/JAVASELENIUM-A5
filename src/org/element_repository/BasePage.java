package org.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(linkText="Log Out")
	private WebElement logoutLink;
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}


	@FindBy(linkText="Shopping cart")
	private WebElement shoppingCartLink;
	
	@FindBy(linkText="Wishlist")
	private WebElement whishlistLink;
	
	@FindBy(partialLinkText="BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText="COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText="ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText="APPAREL & SHOES")
	private WebElement ApparelLink;
	
	@FindBy(partialLinkText="DIGITAL DOWNLOADS")
	private WebElement digitalDownloadsLink;
	
	@FindBy(partialLinkText="JEWELRY")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText="GIFT CARDS")
	private WebElement giftCardsLink;
	
	

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWhishlistLink() {
		return whishlistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelLink() {
		return ApparelLink;
	}

	public WebElement getDigitaDownloadsLink() {
		return digitalDownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
