package com.adp.demonop.pages;

import org.openqa.selenium.WebDriver;

import com.adp.demonop.objectrepository.RegistrationPageElements;

public class RegistrationPage {
	WebDriver driver;

	//clicking on male
	public void selectMale() {
		driver.findElement(RegistrationPageElements.rdo_Male).click();
	}
	
	//enter first name
	public void enterFistName() {
		driver.findElement(RegistrationPageElements.txt_FirstName).sendKeys("Manoj");
	}
}
