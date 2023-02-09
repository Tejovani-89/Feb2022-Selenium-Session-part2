package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownListConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		//By country = driver.findElement(By.id("Form_getForm_Country");
		//this will not accept locator it needs webelement.
		
		By country = By.id("Form_getForm_Country");
		//doSelectDropDownByIndex(country,3);
       // doSelectDropDownByVisibleText(country, "Armenia");
		doSelectDropDownByvalue(country, "Bangladesh");
		
		//WebElement countryele = driver.findElement(country);
		
		
//		Select select = new Select(countryele);
//		select.selectByIndex(3);
	}

	//this is mainly for webelement
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String VisibleText) {
		
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);
	}
	
	public static void doSelectDropDownByvalue(By locator , String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
		
	
	
	
}
