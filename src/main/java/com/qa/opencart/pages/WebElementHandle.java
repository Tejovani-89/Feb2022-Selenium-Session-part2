package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementHandle {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		selectUser("Jordan.Mathews");
		selectUser("Kevin.Mathews");
		
		
	}

	
	public static void selectUser(String name) {
		String Xpath = "//a[text()='"+name+"']/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(Xpath)).click();
		
	}
}
