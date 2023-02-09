package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleelementExceptionConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement fullname = driver.findElement(By.id("Form_getForm_FullName"));
		fullname.sendKeys("teju");
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//solution 
		WebElement fullname1 = driver.findElement(By.id("Form_getForm_FullName"));
		fullname1.sendKeys("vani");
		

	}

}
