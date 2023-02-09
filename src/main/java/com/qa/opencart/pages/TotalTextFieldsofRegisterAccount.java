package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalTextFieldsofRegisterAccount {
static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		
		By textFields = By.className("form-control");
	
		ElementUtils eleutil = new ElementUtils(driver);
		int totalfieldscount = eleutil.getElementsCount(textFields);
		System.out.println(totalfieldscount);
		
	}

}
