package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshesWorkSignUp {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/crm/marketing/signup/");
		driver.getTitle();
		
		By Signuplink = By.linkText("SIGN UP");
		doClick(Signuplink);
//By SignwithEmail = By.linkText("email");
//		doClick(SignwithEmail);
		
//		driver.findElement(By.id("first-name-61719424892161")).sendKeys("Tejovani");
//		String PlacehldrValue = driver.findElement(By.id("first-name-61719424892161")).getAttribute("value");
//		System.out.println(PlacehldrValue);
	}

	
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
