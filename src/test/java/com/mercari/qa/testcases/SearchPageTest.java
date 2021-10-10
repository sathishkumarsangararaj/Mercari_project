package com.mercari.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercari.qa.base.TestBase;
import com.mercari.qa.pages.LoginPage;
import com.mercari.qa.pages.PersonalInfoPage;
import com.mercari.qa.pages.SearchPage;
import com.mercari.qa.pages.TimelineScreenPage;


public class SearchPageTest extends TestBase {
	
	LoginPage loginPage;
	TimelineScreenPage homePage;
	PersonalInfoPage myPage;
	SearchPage searchPage;
	
	public SearchPageTest(){
		super();
		
}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
	}
		
		@Test
		public void validateProductName(){
		
		String producttext = searchPage.searchText("MacBook", 2);
		Assert.assertEquals(producttext, "MacBook");
		}	
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
			 
	}
