package com.mercari.qa.pages;

import com.mercari.qa.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimelineScreenPage extends TestBase {

	
	@FindBy(xpath = "//a[contains(text(),'My Page')]")
	WebElement myPageLink;
	
	// Initializing the Page Objects:
	public TimelineScreenPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
		
	public PersonalInfoPage clickOnmyPageLink(){
		myPageLink.click();
		return new PersonalInfoPage();
	}
	
		
	}
