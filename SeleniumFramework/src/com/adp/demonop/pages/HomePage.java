package com.adp.demonop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adp.demonop.objectrepository.HomePageElements;

public class HomePage {
	WebDriver driver;

	//clicking on register
	public void clickRegister() {
		driver.findElement(HomePageElements.lnk_Register).click();
	}
	
	//clicking on login
	public void clickLogin() {
		driver.findElement(HomePageElements.lnk_Login).click();
	}
	
	//clicking on wishlist
	public void clickWishList() {
		driver.findElement(HomePageElements.lnk_WishList).click();
	}

	//clicking on enter data
	public void enterSearchData() {
		driver.findElement(HomePageElements.txt_SearchBox).sendKeys("Hello");
	}
	
	//clicking on get inner text
	public String getSearchBoxText() {
		return driver.findElement(HomePageElements.txt_SearchBox).getAttribute("placeholder");
	}

}
