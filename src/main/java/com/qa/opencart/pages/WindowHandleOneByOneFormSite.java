package com.qa.opencart.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleOneByOneFormSite {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		
		By FSfacebook = By.xpath("//div[@class='footer__social-networks']/a[@class='youtube']");
		By formsitetwiter = By.xpath("//div[@class='footer__social-networks']/a[@class='twitter']");
		doClick(formsitetwiter);
		getWindowHandles(formsitetwiter);
		doClick(FSfacebook);
		getWindowHandles(FSfacebook);
		
//		driver.findElement(By.xpath("//div[@class='footer__social-networks']/a[@class='twitter']")).click();
//		
//		Set<String> handle = driver.getWindowHandles();
//		Iterator<String> it =handle.iterator();
//		String PWID = it.next();
//		String CWID = it.next();
//		System.out.println("PWID is :"  +driver.getTitle());
//		driver.switchTo().window(CWID);
//		driver.close();
//		driver.switchTo().window(PWID);
		
//driver.findElement(By.xpath("//div[@class='footer__social-networks']/a[@class='facebook']")).click();
//		
//		Set<String> handle1 = driver.getWindowHandles();
//		Iterator<String> it1 =handle1.iterator();
//		String PWID1 = it1.next();
//		//System.out.println(PWID1);
//		String CWID1 = it1.next();
//		//System.out.println(CWID1);
//		driver.switchTo().window(CWID1);
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
//		driver.switchTo().window(PWID1);
		
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		driver.findElement(locator).click();
	}
	
	public static void getWindowHandles(By locator) {
		
		Set<String> handle1 = driver.getWindowHandles();
		Iterator<String> it1 =handle1.iterator();
		String PWID1 = it1.next();
		//System.out.println(PWID1);
		String CWID1 = it1.next();
		//System.out.println(CWID1);
		driver.switchTo().window(CWID1);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(PWID1);
		
	}
}
