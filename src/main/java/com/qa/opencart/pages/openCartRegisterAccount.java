package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class openCartRegisterAccount {

	public static void main(String[] args) {
		
		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.init_driver("chrome");
		brutil.navigateUrl("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		brutil.getPageUrl();
		brutil.getPageTitle();
		brutil.getPageSource();
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtils eleutil = new ElementUtils(driver);
		eleutil.dosendKeys(firstname, "Tejovani");
		eleutil.dosendKeys(lastname, "maisala");
		eleutil.dosendKeys(email, "tejovani_n@gmail.com");
		eleutil.dosendKeys(password, "test@123");
		
		//brutil.quitBrowser();

	}

}
