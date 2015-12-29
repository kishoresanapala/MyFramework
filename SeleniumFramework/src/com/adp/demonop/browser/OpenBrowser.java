package com.adp.demonop.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {
	
	WebDriver driver;
	
	public WebDriver openDriver(String browserName){
		if(browserName.equals("firefox"))
			driver= new FirefoxDriver();
		else if (browserName.equals("ie")){
			System.setProperty("webdriver.ie.driver", "path of .exe file");
			driver= new InternetExplorerDriver();
		}
		else if (browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "path of .exe file");
			driver= new ChromeDriver();
		}
		return driver;
	}

}
