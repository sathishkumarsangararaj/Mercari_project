package com.mercari.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mercari.qa.base.TestBase;

public class SearchPage extends TestBase {
	
	@FindBy(xpath = "//a[name(),'search')]")
	WebElement searchbar;
	
	@FindBy(name = "q")
	WebElement searchBtn;
	
		
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	

	public String searchText(String searchtext, int itemIndex) {
		
		searchbar.sendKeys(searchtext);
		searchBtn.click();
		
		List<WebElement> linkList = driver.findElements(By.xpath("//div"));
		linkList.get(itemIndex).click(); //click 3rd element after search 
		
		String producttext = driver.findElement(By.id("abc")).getText(); //get the text attribute on 3rd element
		
		return producttext;		
		
	}
}
