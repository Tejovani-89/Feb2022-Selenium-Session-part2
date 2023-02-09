package com.qa.opencart.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleFormSite {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//div[@class='footer__social-networks']/a[@class='twitter']")).click();
		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String ParentwindowID = it.next();
		System.out.println("parentWID :" +ParentwindowID);
		
		String ChildWindowID = it.next();
		System.out.println("childWID :" +ChildWindowID);
		
		
		driver.switchTo().window(ChildWindowID);
		
		System.out.println("childwindowtitle  :" +driver.getCurrentUrl());
		driver.close();
		

	}

}
