package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowConcept {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		String PWID = driver.getWindowHandle();
		String GoogleWID = driver.getWindowHandle();
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	
		driver.switchTo().window(PWID);
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
