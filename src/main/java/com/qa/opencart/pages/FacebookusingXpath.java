package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookusingXpath {
       static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("tejovani_n@yahoo.co.in");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("praveenm");
//		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
//		By name = By.xpath("//*[@id=\"email\"]");
//		By paswrd = By.xpath("//*[@id=\"pass\"]");
//		By loginbtn = By.xpath("//*[@id=\"loginbutton\"]");
//		By errmsg = By.xpath("//*[@id=\"email_container\"]/div[2]");
//		
//		
//		doSendKeys(name, "tejovanigmail.com");
//		doSendKeys(paswrd, "prav");
//		doClick(loginbtn);
//		
//		String actulerrormsg = doGetElementText(errmsg);
//		System.out.println(actulerrormsg);
//		if(actulerrormsg.equalsIgnoreCase(actulerrormsg)) {
//			System.out.println("Correct msg");
//		}
//		else {
//			System.out.println("Incorrect msg");
//		}
		
		//*** CSS Selector *****
//		driver.findElement(By.cssSelector("#email")).sendKeys("tejovani_n@gmail.com");
//		driver.findElement(By.cssSelector("#pass")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#loginbutton")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("Tejovani@gmail.com");
		String PlacehldrValue = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(PlacehldrValue);

	}
	
	public static String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	public static void doSendKeys(By locator , String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	

}
