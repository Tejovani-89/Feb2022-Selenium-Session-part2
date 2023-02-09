package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;
	public static void main(String[] args) {
	
		
		//WebElement = locator + Actions
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.id("email")).sendKeys("tejovani_n@yahoo.co.in");
//		driver.findElement(By.id("pass")).sendKeys("praveenm");
		
//		WebElement emailid = driver.findElement(By.id("email"));
//		WebElement paswrd = driver.findElement(By.id("pass"));
//		
//		emailid.sendKeys("tejovani_n@yahoo.co.in");
//		paswrd.sendKeys("praveenm");
		
		
		
//		By emailid1 = By.id("email");
//		By paswrd1 = By.id("pass");
//		
//		WebElement email_ele = driver.findElement(emailid1);
//		WebElement paswrd_ele = driver.findElement(paswrd1);
//		
//		email_ele.sendKeys("tejovani_n@yahoo.co.in");
//		paswrd_ele.sendKeys("praveenm");
		
		
//		//By locator with Generic method
		
		
//		By emailid = By.id("email");
//     	By paswrd = By.id("pass");
//     	
//     	
//     	getElement(emailid).sendKeys("tejovani_n@yahoo.co.in");
//     	getElement(paswrd).sendKeys("praveenm");
			
		
		//By locator with Generic method in elementUtils class
		
		
		By emailid = By.id("email");
     	By paswrd = By.id("pass");
     	
     	ElementUtils eleUtil = new ElementUtils(driver);
     	eleUtil.dosendKeys(emailid, "\"tejovani_n@yahoo.co.in\"");
     	eleUtil.dosendKeys(paswrd, "praveenm");
     	
		
     	// some companys will approch -String locator OR with generic methods in ElementUtil class
     	String email_id = "input-email";
		String password_id = "input-password";
		
		dosendKeys(getBy("Id", email_id), "naveen@gmail.com");
		dosendKeys(getBy("id", password_id), "test@123");

     	
     	
	}
	public static By getBy(String locatorType, String locatorValue) {

		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;

		default:
			System.out.println("please pass the right locator....");
			break;
		}

		return locator;
	}
	
	
	
	public  static void dosendKeys(By locator , String value) {
		getElement(locator).sendKeys(value);
	}
	
	public  static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
