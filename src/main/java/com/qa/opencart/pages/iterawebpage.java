package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class iterawebpage {

	public static void main(String[] args) {
		
		
		BrowserUtil brwutil = new BrowserUtil();
		WebDriver driver = brwutil.init_driver("firefox");
		brwutil.navigateUrl("https://itera-qa.azurewebsites.net/home/automation");
		brwutil.getPageTitle();
		brwutil.getPageUrl();
		
		By name = By.id("name");
		By phonenmbr = By.id("phone");
		By emailid = By.id("email");
		By paswrd = By.id("password");
		By addrs = By.id("address");
		
		
		
		ElementUtils eleutl = new ElementUtils(driver);
		eleutl.dosendKeys(name, "Tejovani");
		eleutl.dosendKeys(phonenmbr, "9563287436");
		eleutl.dosendKeys(emailid, "test@123@gmailcom");
		eleutl.dosendKeys(paswrd, "test@1234");
		eleutl.dosendKeys(addrs, "mgr nagar , velachery,chennai.");
		
		brwutil.quitBrowser();
		

	}

}
