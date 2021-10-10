package com.mercari.qa.testcases;



	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	

	import com.mercari.qa.base.TestBase;
import com.mercari.qa.pages.AddShippingPage;
import com.mercari.qa.pages.LoginPage;
import com.mercari.qa.pages.PersonalInfoPage;
import com.mercari.qa.pages.ShippingAddressPage;
import com.mercari.qa.pages.TimelineScreenPage;
import com.mercari.qa.util.TestUtil;

	public class AddShippingPageTest extends TestBase{

		LoginPage loginPage;
	
		TestUtil testUtil;
		TimelineScreenPage homePage;
		PersonalInfoPage myPage;
		ShippingAddressPage shippingPage;
		AddShippingPage newAddressPage;
		
		String sheetName = "sheet1";
		
		public AddShippingPageTest(){
				super();
				
		}
		
		
		@BeforeMethod
		public void setUp() throws InterruptedException {
			
			initialization();
			testUtil = new TestUtil();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
					
			
			myPage = homePage.clickOnmyPageLink();
			shippingPage = myPage.clickOnshippingAddressLink();
			newAddressPage = shippingPage.clickOnaddShippingLink(); 
		}
		
				
		@DataProvider
		public Object[][] getNewAddressDetailsTestData(){
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
		
		
		@Test(priority=1, dataProvider="getNewAddressDetailsTestData")
		public void validateCreateNewAddress(String fName, String lName, String AddrLine1, String AddrLine2, String postal){
			shippingPage.clickOnaddShippingLink();
			newAddressPage.addNewAddress(fName, lName, AddrLine1, AddrLine2, postal);
			
		}
		
		

		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		
	}

