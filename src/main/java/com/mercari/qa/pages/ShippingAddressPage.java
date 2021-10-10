package com.mercari.qa.pages;

import com.mercari.qa.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressPage extends TestBase {

	
	@FindBy(xpath = "//a[contains(text(),'New Address')]")
	WebElement addShippingLink;
	
	
	// Initializing the Page Objects:
	public ShippingAddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyShippingAddressPageTitle(){
		return driver.getTitle();
	}
	
	
		
	public AddShippingPage clickOnaddShippingLink(){
		addShippingLink.click();
		return new AddShippingPage();
	}
	
		
	}
