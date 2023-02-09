package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.getTitle();
		
		
		
//		driver.findElement(By.id("input-firstname")).sendKeys("Tejovani");
//		String PlacehldrValue = driver.findElement(By.id("input-firstname")).getAttribute("value");
//		System.out.println(PlacehldrValue);
		
		
		
		By name = By.id("input-firstname");
		doSendKeys(name,"Tejovani");
		System.out.println(getAttributeValue(name , "placeholder"));
		System.out.println(getAttributeValue(name , "value"));
		
		if(isDisplayed(name)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

	
	public static boolean isDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static String getAttributeValue(By locator , String AttributeValue) {
		return getElement(locator).getAttribute(AttributeValue);
	}
	
	public static void doSendKeys(By locator , String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
}
