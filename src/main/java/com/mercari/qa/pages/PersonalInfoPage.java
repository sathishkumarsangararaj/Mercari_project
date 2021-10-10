package com.mercari.qa.pages;

import com.mercari.qa.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfoPage extends TestBase {

	
	@FindBy(xpath = "//a[contains(text(),'Shipping Address')]")
	WebElement shippingAddressLink;
	
	// Initializing the Page Objects:
	public PersonalInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPersonalInfoPageTitle(){
		return driver.getTitle();
	}
	
	
		
	public ShippingAddressPage clickOnshippingAddressLink(){
		shippingAddressLink.click();
		return new ShippingAddressPage();
	}
	
		
	}
