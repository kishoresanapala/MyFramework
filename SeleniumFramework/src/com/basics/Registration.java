package com.basics;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.adp.demonop.util.ReadProperties;

public class Registration {
	WebDriver driver;

	public static void main(String[] args) throws IOException {
		Registration ob= new Registration();
		ob.openApplication();
		
	}

	public void openApplication() throws IOException {
		driver = new FirefoxDriver(); // opens browser
		driver.get(ReadProperties.readProp("URL")); // hit URL
		 // clicking on login link
		driver.findElement(By.xpath("//input[@value='Log in']")).click(); // clicking on login button
		
		String value=driver.findElement(By.xpath("//span[@for='Email']")).getText(); // getting the error message
		System.out.println(value);
		if(value.equals("Please enter your email"))
			System.out.println("Please enter your email is displayed");
		
		String defautText=driver.findElement(By.id("small-searchterms")).getTagName();
		
		Select select= new Select(driver.findElement(By.name("DateOfBirthDay")));
		select.getFirstSelectedOption().getText(); // default selected value
		List<WebElement> values=select.getOptions();
		
		// getting all values from dropdown
		for(WebElement w:values){
			System.out.println(w.getText()); 
		}
		
	}

	public void lastName(){
		
		 
		//clickElement(By.linkText("Register"));
		
	}
	
	public void clickElement(By by){
		driver.findElement(by).click();
	}
	
	
}

