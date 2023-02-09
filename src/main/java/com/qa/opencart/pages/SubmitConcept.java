package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitConcept {
static WebDriver driver;
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

driver.findElement(By.id("input-email")).sendKeys("tejovani@gmail.com");
driver.findElement(By.id("input-password")).sendKeys("test123");
driver.findElement(By.id("input-password")).submit();

	}

}
