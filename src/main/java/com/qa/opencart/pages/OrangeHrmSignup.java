package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmSignup {

	
	public static void main(String[] args) {
	
		BrowserUtil brutil = new BrowserUtil();
		
		WebDriver driver = brutil.init_driver("chrome");
		
		brutil.navigateUrl("https://www.orangehrm.com/hris-hr-software-demo/");
		
		brutil.getPageTitle();
		brutil.getPageUrl();
		
		
		
		By fullname = By.id("Form_getForm_FullName");
		By emailid = By.id("Form_getForm_Email");
		By phonenumbr = By.id("Form_getForm_Contact");
		
		ElementUtils eleutil = new ElementUtils(driver);
		eleutil.dosendKeys(fullname, "Tejovani");
		eleutil.dosendKeys(emailid, "kushma.nuguri@gmail.com");
		eleutil.dosendKeys(phonenumbr, "9003065971");
		
		brutil.quitBrowser();
		
		
		
		

	}

}
