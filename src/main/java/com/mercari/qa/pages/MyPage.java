package com.mercari.qa.pages;

import com.mercari.qa.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPage extends TestBase {

	
	@FindBy(xpath = "//a[contains(text(),'My Page')]")
	WebElement personalInfoPageLink;
	
	// Initializing the Page Objects:
	public MyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
		
	public PersonalInfoPage clickOnpersonalInfoPageLink(){
		personalInfoPageLink.click();
		return new PersonalInfoPage();
	}
	
		
	}
