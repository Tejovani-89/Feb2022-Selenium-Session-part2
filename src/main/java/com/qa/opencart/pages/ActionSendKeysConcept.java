package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSendKeysConcept {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.get("https://fs1.formsite.com/form_app/FormSite?FormId=LoadLogin&Auto");
		
	By userName = By.id("UserId");
	By passwrd = By.id("Password");
	By GoogleLink = By.id("link-login-google");
	
	doActionSendKeys(userName , "Tejovani");
	doActionSendKeys(passwrd , "test@123");
	doActionsClick(GoogleLink);
	
	
//	Actions act = new Actions(driver);
//	act.sendKeys(driver.findElement(userName), "Tejovani").perform();
//	act.sendKeys(driver.findElement(passwrd), "test@123").perform();
		
		
		}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static void doActionSendKeys(By locator , String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
		
	}

}
