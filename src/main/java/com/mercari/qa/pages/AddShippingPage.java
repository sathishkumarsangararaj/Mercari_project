package com.mercari.qa.pages;

import com.mercari.qa.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddShippingPage extends TestBase {

	
	@FindBy(xpath = "//a[contains(text(),'New Address')]")
	WebElement addressRegisteredLink;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="address_line1")
	WebElement addressLine1;
	
	@FindBy(name="address_line2")
	WebElement addressLine2;
	
	@FindBy(name="pin_code")
	WebElement postalcode;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	
	// Initializing the Page Objects:
	public AddShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyAddShippingPageTitle(){
		return driver.getTitle();
	}
	
	public void addNewAddress(String fName, String lName, String addr1, String addr2, String pin){
		
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		addressLine1.sendKeys(addr1);
		addressLine2.sendKeys(addr2);
		postalcode.sendKeys(pin);
		saveBtn.click();
		
	}
	
	
		
	public ShippingAddressPage clickOnaddressRegisteredLink(){
		addressRegisteredLink.click();
		return new ShippingAddressPage();
	}
	
		
	}
