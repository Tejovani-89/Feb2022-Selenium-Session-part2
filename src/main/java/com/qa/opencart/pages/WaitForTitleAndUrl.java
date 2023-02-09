package com.qa.opencart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitleAndUrl {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.findElement(By.linkText("Contact Sales")).click();
		
		String title = waitForTitleContains("Contact", 5);
		System.out.println(title);
		
		String title1 = waitForTitleIs("Contact OrangeHRM | OrangeHRM", 5);
		System.out.println(title1);
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		if(wait.until(ExpectedConditions.titleContains("Contact"))) {
//			System.out.println(driver.getTitle());
//		}

	}

	public static String waitForTitleContains(String titleContains , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleContains(titleContains))) {
			return driver.getTitle();
		}
		return null;
	}
	
	
	
	public static String waitForTitleIs(String Title , int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleIs(Title))) {
			return driver.getTitle();
		}
		
		return null;
	}
	
}
